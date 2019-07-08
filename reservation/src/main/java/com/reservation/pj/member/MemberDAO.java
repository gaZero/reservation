package com.reservation.pj.member;

import javax.inject.Inject;
import javax.xml.stream.events.Namespace;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberDAO {

	private static final String namespace="com.hotel.member.MemberMapper";
	@Inject
	private SqlSession sqlSession;
	
	public void memberjoin(MemberVO mv) {
		sqlSession.insert(namespace+"member.memberjoin",mv);
	}
	
	public MemberVO emailcheck(String email) {
		return sqlSession.selectOne(namespace+"member.memberjoin",email);
	}

	public MemberVO idcheck(String id) {
		return sqlSession.selectOne(namespace+"member.emailcheck", id);
	}
	
	public MemberVO memberlogin(MemberVO vo) {
		return sqlSession.selectOne(namespace+".memberlogin",vo);
	}
	
}