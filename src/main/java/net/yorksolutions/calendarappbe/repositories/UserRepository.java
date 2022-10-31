package net.yorksolutions.calendarappbe.repositories;

import net.yorksolutions.calendarappbe.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
