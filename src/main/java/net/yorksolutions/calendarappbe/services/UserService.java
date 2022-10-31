package net.yorksolutions.calendarappbe.services;

import net.yorksolutions.calendarappbe.models.User;
import net.yorksolutions.calendarappbe.repositories.EventRepository;
import net.yorksolutions.calendarappbe.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final EventRepository eventRepository;

    @Autowired
    public UserService(UserRepository userRepository, EventRepository eventRepository) {
        this.userRepository = userRepository;
        this.eventRepository = eventRepository;
    }

    public Iterable<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public void addNewUser(User user) {
        this.userRepository.save(user);
    }

    public void addEventToUser(Long user_id, Long event_id) {
        final var user = this.userRepository.findById(user_id).orElseThrow();
        final var event = this.eventRepository.findById(event_id).orElseThrow();
        user.createdEvents.add(event);
        this.userRepository.save(user);
    }



}
