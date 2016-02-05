package org.zerock.persistence;

import org.zerock.domain.MemberVO;

/**
 * Created by dw on 2016. 2. 5..
 */
public interface MemberDAO {
    public String getTime();

    public void insertMember(MemberVO vo);
}
