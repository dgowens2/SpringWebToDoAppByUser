package com.tiy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DTG2 on 09/15/16.
 */
@Controller
public class ToDoController {
    @Autowired
    ToDoRepository todos;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model) {
        Iterable<ToDo> allToDos = todos.findAll();
        List<ToDo> todoList = new ArrayList<ToDo>();
        for (ToDo game : allToDos) {
            todoList.add(game);
        }
        model.addAttribute("games", todoList);
        return "home";
    }

    @RequestMapping(path = "/add-todo", method = RequestMethod.POST)
    public String addToDo(String toDoName, boolean is_done) {
        ToDo todo = new ToDo(toDoName, is_done);
        todos.save(todo);
        return "redirect:/";
    }
}
