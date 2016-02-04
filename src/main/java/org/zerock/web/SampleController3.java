package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.ProductVo;

/**
 * Created by dw on 2016. 2. 4..
 */
@Controller
public class SampleController3 {
    private static final Logger log = LoggerFactory.getLogger(SampleController3.class);

    @RequestMapping("/doD")
    public String doD(Model model) {
        //make sample data
        ProductVo product = new ProductVo("Sample Product", 10000);
        log.info("doD");

        model.addAttribute(product);

        return "productDetail";
    }
}
