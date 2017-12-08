package com.wbz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by wei on 2016/12/13.
 */
@Controller
@RequestMapping("/")
public class AppController {

    @RequestMapping(value={"/new"},method = RequestMethod.POST)
    public String saveEmployee(){
        return "success";
    }
}
