package com.java_project.my_project.controller;

import org.springframework.web.bind.annotation.*;

/**
 * * это класс контроллера.
 */
@RestController
@RequestMapping("/api/v1/project")
public class MainController {

    /**
     *
     * @param x
     * @param y
     * @return string
     */
    @GetMapping("/addpoint1")
    public String addPoint1(@RequestParam final double x,
                            @RequestParam final double y) {
        return "Point added: (" + x + ", " + y  + ")";
    }

    /**
     *
     * @param x
     * @param y
     * @return string
     */
    @GetMapping("/addpoint2/{x}/{y}")
    public String addPoint2(@PathVariable final double x,
                            @PathVariable final double y) {
        return "Point added: (" + x + ", " + y + ")";
    }
}
