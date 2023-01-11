package io.zipcoder.tc_spring_poll_application.repositories;

import io.zipcoder.tc_spring_poll_application.domain.Poll;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepository<Option, Long> {
    Iterable<Poll> findAll();
}
