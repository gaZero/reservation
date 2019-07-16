package com.reservation.pj.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InfoController {

	@RequestMapping("**/favicon.ico")
    public String favicon() {
        return "forward:/resources/fav.ico";
    }
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String info() {
		return "info";
	}
	@RequestMapping(value = "/booking", method = RequestMethod.GET)
	public String booking() {
		return "booking";
	}
	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String mypage() {
		return "mypage";
	}
}
