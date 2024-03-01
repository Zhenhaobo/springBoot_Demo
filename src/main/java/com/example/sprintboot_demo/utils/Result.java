package com.example.sprintboot_demo.utils;

import java.util.HashMap;
import java.util.Map;

public class Result {

   public static Object success(Object data){
        Map res = new HashMap<>();
        res.put("data",data);
        res.put("code",0);
        res.put("msg","sussess");
        return res;
    }
}
