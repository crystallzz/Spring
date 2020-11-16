package com.sist.web;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.manager.MovieManager;
import com.sist.manager.MovieVO;

// Model=> JSP (HTML(태그형)+JAVA)
//JSP (HTML(태그형) =>VIEW)
// JAVA => Model(1.VO ,2.DAO , 3.Manager)
//Controller 스프링안에서는 이미 제작이 되어 있음
// => 작동 (매뉴얼 제작 => XML) 
// 이 클래스는 => Model 역할
@Controller
public class MovieController {
	@Autowired
	private MovieManager mgr;
	@RequestMapping("movie/main.do")
	public String movie_main(int no,Model model)
	{
		List<MovieVO> list=mgr.jsonAllData(no);
		model.addAttribute("list",list);
		return "movie/main";
	}
}
