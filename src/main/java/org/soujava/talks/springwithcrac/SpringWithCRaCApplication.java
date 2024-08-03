package org.soujava.talks.springwithcrac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringWithCRaCApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWithCRaCApplication.class, args);
    }

}

@RestController
@RequestMapping("/jconfbr")
class Endpoints {

    final Registration registration;

    Endpoints(Registration repository) {
        this.registration = repository;
    }

    @GetMapping
	public String get() {
		return "Hello JConfBR!";
	}

    record AttendeeRepresentation(Long id, String name, Set<String> technologies) {
        AttendeeRepresentation (Attendee attendee){
            this(attendee.id(),
                    attendee.name(),
                    attendee.tecnologies().stream()
                            .map(Technology::name).collect(Collectors.toSet()));
        }
    }

	@GetMapping("/attendees")
    public List<AttendeeRepresentation> attendees() {
		return registration.findAll().stream().map(AttendeeRepresentation::new).toList();
	}

}

@Repository
interface Registration extends CrudRepository<Attendee, Long> {
    List<Attendee> findAll();
}

@Table("attendee_technologies")
record Technology(@Column("technology") String name) { }

record Attendee(@Id Long id,
                String name,
                @MappedCollection(idColumn = "attendee_id")
                Set<Technology> tecnologies) { }