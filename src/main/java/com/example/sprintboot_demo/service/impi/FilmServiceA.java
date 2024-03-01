package com.example.sprintboot_demo.service.impi;
import com.example.sprintboot_demo.service.FilmService;
import com.example.sprintboot_demo.utils.RandomString;

import java.util.*;

public class FilmServiceA implements FilmService {

    public List getFilmList() {
        List list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Map obj = new HashMap<>();
            obj.put("name", "甄" + RandomString.generateRandomChineseString(2));
            obj.put("age", new Random().nextInt(100));
            list.add(obj);
        }
        return list;
    }
}
