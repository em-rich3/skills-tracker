package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping()
    @ResponseBody
    public String skills() {
        return "<html>" +
            "<body>" +
                "<h1> Skills Tracker </h1>"  +
                    "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                        "<ol>" +
                            "<li> Java </li>" +
                            "<li> JavaScript </li>" +
                            "<li> Python </li>" +
                        "</ol>" +
            "</body>" +
        "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String getForm() {
        return "<html>" +
                    "<body>" +
                        "<form action='form' method='post'>" + //submit a request to /skills
                            "<label> Name: </label>" + "<br>" +
                            "<input type='text' name='name'>" + "<br>" +

                            "<label> My favorite language: </label>" + "<br>" +
                                "<select name='firstChoice'>" +
                                    "<option>Java</option>" +
                                    "<option>JavaScript</option>" +
                                    "<option>Python</option>" +
                                "</select>" + "<br>" +

                            "<label> My second favorite language: </label>" + "<br>" +
                                "<select name='secondChoice'>" +
                                    "<option>Java</option>" +
                                    "<option>JavaScript</option>" +
                                    "<option>Python</option>" +
                                "</select>" + "<br>" +

                            "<label> My third favorite language: </label>" + "<br>" +
                                "<select name='thirdChoice'>" +
                                    "<option>Java</option>" +
                                    "<option>JavaScript</option>" +
                                    "<option>Python</option>" +
                                "</select>" + "<br>" +

                            "<input type='submit' value='Submit'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping("form")
    @ResponseBody
    public String postForm(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>"  +
                    "<ol>" +
                        "<li>" + firstChoice + "</li>" +
                        "<li>" + secondChoice + "</li>" +
                        "<li>" + thirdChoice + "</li>" +
                    "</ol>" +
                "</body>" +
                "</html>";
    }
}
