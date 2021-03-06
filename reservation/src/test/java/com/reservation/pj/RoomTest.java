package com.reservation.pj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class) 
@WebAppConfiguration
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"}
		//애플리케이션,서블릿 컨텍스트 설정 사용
	)
public class RoomTest {

	@Autowired
	private WebApplicationContext wac;
	private MockMvc mock;
	
	@Test
	public void test() throws Exception {
		mock=MockMvcBuilders.webAppContextSetup(wac).build();
		RequestBuilder req = MockMvcRequestBuilders.post("/room1");
		mock.perform(req);
	}
	@Test
	public void roomcheck() throws Exception{
		mock=MockMvcBuilders.webAppContextSetup(wac).build();
		RequestBuilder req = MockMvcRequestBuilders.post("/roomcheck");
		mock.perform(req);
	}
}

