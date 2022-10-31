package net.yorksolutions.calendarappbe.services;

import net.yorksolutions.calendarappbe.models.Event;
import net.yorksolutions.calendarappbe.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Iterable<Event> getAllEvents() {
        return this.eventRepository.findAll();
    }

    public void addNewEvent(Event event) {
        this.eventRepository.save(event);
    }

}
