package com.reservation.pj.room;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public void roomset(RoomVO rv) {
		System.out.println("Room Setting");
		sqlSession.selectOne("room.roomset", rv);
	}
	
	public RoomVO roomcheck(RoomVO rv) {

		return sqlSession.selectOne("room.roomcheck", rv);
	}
	
	public RoomVO stayroomcheck(RoomVO rv) {
		return sqlSession.selectOne("room.stayroomcheck", rv);
	}

	public void roomupdate(RoomVO rv) {
		sqlSession.selectOne("room.roomupdate", rv);
	}

	public List<RoomVO> remainingrooms(String roomType) {
		return sqlSession.selectList("room.remainingrooms",roomType);
	}
	
	public void roomchange(RoomVO rv) {
		sqlSession.selectList("room.roomchange",rv);
	}
	
}
