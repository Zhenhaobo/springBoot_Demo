package com.example.sprintboot_demo.controller;

import com.example.sprintboot_demo.service.impi.FilmServiceA;
import com.example.sprintboot_demo.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Film {
    @GetMapping("")
    public Object getFilmList(){
        List list = new FilmServiceA().getFilmList();
         return Result.success(list);
    }
}
