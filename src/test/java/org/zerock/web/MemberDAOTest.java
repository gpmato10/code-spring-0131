package org.zerock.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.MemberVO;
import org.zerock.persistence.MemberDAO;

import javax.inject.Inject;

/**
 * Created by dw on 2016. 2. 5..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class MemberDAOTest {
    @Inject
    private MemberDAO dao;

    @Test
    public void testName() throws Exception {
        System.out.println(dao.getTime());
        System.out.println(dao.getTime());
        System.out.println(dao.getTime());

    }

    @Test
    public void testTime() throws Exception {
        System.out.println(dao.getTime());
    }

    @Test
    public void testInsertMember() throws Exception {
        MemberVO vo = new MemberVO();
        vo.setUserid("user00");
        vo.setUserpw("user00");
        vo.setUsername("USER00");
        vo.setEmail("user00@aaa.com");

        dao.insertMember(vo);
    }

    @Test
    public void testSelectOne1() throws Exception {
        MemberVO vo = new MemberVO();
        vo.setUserid("user01");
        vo.setUserpw("user01");
        vo.setUsername("USER01");
        vo.setEmail("user01@aaa.com");

        dao.insertMember(vo);
        dao.readMember("user01");
        System.out.println(dao.readMember("user01"));
    }
}
