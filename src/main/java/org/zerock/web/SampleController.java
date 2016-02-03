package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dw on 2016. 2. 1..
 */
@Controller
public class SampleController {
    private static final Logger log = LoggerFactory.getLogger(SampleController.class);

    @RequestMapping("doA")
    public void doA() {
        log.info("doA called......");
    }

    @RequestMapping("doB")
    public void doB() {
        log.info("doB called");
    }

    @RequestMapping("123")
    public String ss() {
        return "123";
    }
}
