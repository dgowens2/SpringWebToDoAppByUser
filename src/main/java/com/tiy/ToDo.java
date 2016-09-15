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

    @Column(nullable = false)
    boolean is_done;

    public ToDo() {
    }

    public ToDo(String text, boolean is_done) {
        this.text = text;
        this.is_done = false;
    }
}
