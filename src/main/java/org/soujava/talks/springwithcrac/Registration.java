package org.soujava.talks.springwithcrac;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface Registration extends ListCrudRepository<Attendee, Long> {

    List<Attendee> findAll();

}
