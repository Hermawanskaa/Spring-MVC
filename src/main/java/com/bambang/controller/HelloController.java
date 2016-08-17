package com.bambang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bambang on 17/08/16.
 */

/**
 * @Controller fungsi untuk menjadikan sebuah class menjadi Controller
 * @RequestMapping fungsi untuk memapping/memberikan nilai dari permintaan client
 * @ResponseBody fungsi untuk mengeksekusi permintaan client dan akan dipassing dengan annotation @RequestMapping
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "resultPage";
    }
}
