package com.tiy;

import javax.persistence.*;

/**
 * Created by DTG2 on 09/15/16.
 */
@Entity
@Table(name = "todos")
public class ToDo {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String text;

    @Column(nullable = false) //do we add this since false is a boolean condition?
    boolean is_done;

    @ManyToOne
    User user;

    public ToDo() {
    }

    public ToDo(String text, boolean not_done, User user) {
        this.text = text;
        this.is_done = not_done;
        this.user = user;
    }
}
