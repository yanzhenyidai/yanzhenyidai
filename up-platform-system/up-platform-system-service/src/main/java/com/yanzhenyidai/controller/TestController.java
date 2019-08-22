package com.yanzhenyidai.controller;

import com.yanzhenyidai.domain.Test;
import com.yanzhenyidai.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author tanzhen.frank
 * @since 1.0.0
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<Test> query() {
        return testService.query();
    }
}
