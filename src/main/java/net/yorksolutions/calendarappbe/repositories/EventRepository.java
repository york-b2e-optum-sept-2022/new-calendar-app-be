package net.yorksolutions.calendarappbe.repositories;

import net.yorksolutions.calendarappbe.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
}
