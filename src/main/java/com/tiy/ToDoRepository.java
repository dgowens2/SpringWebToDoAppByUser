package com.tiy;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by DTG2 on 09/15/16.
 */
public interface ToDoRepository extends CrudRepository<ToDo, Integer> {
    List<ToDo> findByText(String text);
//    List<ToDo> findByIs_done(boolean is_done);

    List<ToDo> findByUser(User user);

    @Query("SELECT t FROM ToDo t WHERE t.text LIKE ?1%")
    List<ToDo> findByNameStartsWith(String text);
}
