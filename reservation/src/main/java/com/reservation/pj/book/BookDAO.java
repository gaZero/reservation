package com.reservation.pj.book;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookDAO {
	
	
	@Autowired
	private SqlSession sqlssion;
	
	public void bookinsert(BookVO bv) {
		System.out.println(bv.getBook_seq());
	 sqlssion.insert("book.bookinsert",bv);
	}
	public List<BookVO> mybookselect(String id){
		return sqlssion.selectList("book.mybookselect",id);
	}
	public void mybookdelete(String seq) {
		sqlssion.delete("book.mybookdelete",seq);
	}
}
