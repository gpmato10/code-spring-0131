package org.zerock.persistence;

import org.zerock.domain.MemberVO;

/**
 * Created by dw on 2016. 2. 5..
 */
public interface MemberDAO {
    public String getTime();

    public void insertMember(MemberVO vo);

    public MemberVO readMember(String userid) throws Exception;

    public MemberVO readWithPw(String userid, String userpw) throws Exception;
}
