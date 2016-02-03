package org.zerock.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.sql.Connection;

/**
 * Created by dw on 2016. 1. 31..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*.xml")
public class DataSourceTest {
    @Inject
    private DataSource ds;

    @Test
    public void testConnection() throws Exception {
        try (Connection con = ds.getConnection()) {
            System.out.println(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
