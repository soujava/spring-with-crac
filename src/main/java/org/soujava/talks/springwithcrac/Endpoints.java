package org.soujava.talks.springwithcrac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

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
        AttendeeRepresentation(Attendee attendee) {
            this(attendee.getId(),
                    attendee.getName(),
                    attendee.getTechnologies());
        }
    }

    @GetMapping("/attendees")
    public List<AttendeeRepresentation> attendees() {
        return registration.findAll().stream().map(AttendeeRepresentation::new).toList();
    }

}
