package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by dw on 2016. 2. 4..
 */
@Controller
public class SampleController4 {

    private static final Logger log = LoggerFactory.getLogger(SampleController4.class);

    @RequestMapping("/doE")
    public String doE(RedirectAttributes rttr) {
        log.info("doE called but redirect to /doF...");

        rttr.addFlashAttribute("msg", "This is the Message!! with redirect");
        return "redirect:/doF";
    }

    @RequestMapping("/doF")
    public void doF(String msg) {
        log.info("doF called......" + msg);
    }
}
