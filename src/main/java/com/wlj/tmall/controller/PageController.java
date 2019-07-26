package com.wlj.tmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wlj
 * @create 2019-07-25 16:26
 */
@Controller
@RequestMapping("")
public class PageController {
    @RequestMapping("registerPage")
    public String registerPage() {
        return "fore/register";
    }

    @RequestMapping("registerSuccessPage")
    public String registerSuccessPage() {
        return "fore/registerSuccess";
    }

    @RequestMapping("loginPage")
    public String loginPage() {
        return "fore/login";
    }

    @RequestMapping("forealipay")
    public String alipay() {
        return "fore/alipay";
    }
}
