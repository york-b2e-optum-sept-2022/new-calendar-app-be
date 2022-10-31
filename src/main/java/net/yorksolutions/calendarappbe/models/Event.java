package net.yorksolutions.calendarappbe.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {
    public String eventName;
    public String eventDesc;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;



}
