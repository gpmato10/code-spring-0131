package org.zerock.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.inject.Inject;

/**
 * Created by dw on 2016. 2. 5..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("classpath:/applicationContext.xml")
public class SampleControllerTest {
    private static final Logger log = LoggerFactory.getLogger(SampleControllerTest.class);

    @Inject
    private WebApplicationContext wac;

    private MockMvc mockMvc;
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        log.info("setup...........");
    }

    @Test
    public void testDoA() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/doA"));
    }
}
