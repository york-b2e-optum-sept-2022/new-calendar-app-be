package net.yorksolutions.calendarappbe.controller;

import net.yorksolutions.calendarappbe.models.Event;
import net.yorksolutions.calendarappbe.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/event")
@CrossOrigin
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public Iterable<Event> getAllEvents() {
        return this.eventService.getAllEvents();
    }

    @PostMapping
    public void addNewEvent(@RequestBody Event event) {
        this.eventService.addNewEvent(event);
    }

}
