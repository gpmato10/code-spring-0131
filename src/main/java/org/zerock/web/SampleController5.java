package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.ProductVo;

/**
 * Created by dw on 2016. 2. 5..
 */
@Controller
public class SampleController5 {
    @RequestMapping("/doJSON")
    public @ResponseBody ProductVo doJSON() {
        ProductVo vo = new ProductVo("샘플상품", 30000);

        return vo;
    }
}
