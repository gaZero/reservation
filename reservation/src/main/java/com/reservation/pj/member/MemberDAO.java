package com.reservation.pj.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public void memberjoin(MemberVO mv) {
		sqlSession.insert("member.memberjoin",mv);
	}
	
	public MemberVO emailcheck(String email) {
		return sqlSession.selectOne("member.emailcheck",email);
	}

	public MemberVO idcheck(String id) {
		return sqlSession.selectOne("member.idcheck", id);
	}
	
	public MemberVO memberlogin(MemberVO vo) {
		return sqlSession.selectOne("member.memberlogin",vo);
	}
	
}