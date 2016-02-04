package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dw on 2016. 2. 4..
 */
@Controller
public class SampleController2 {
    private static final Logger log = LoggerFactory.getLogger(SampleController2.class);

    @RequestMapping
    public String doC(@ModelAttribute("msg") String msg) {
        log.info("doC called........");
        return "result";
    }
}
