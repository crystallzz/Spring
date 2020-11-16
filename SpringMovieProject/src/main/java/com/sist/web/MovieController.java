package com.sist.web;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.manager.MovieManager;
import com.sist.manager.MovieVO;

// Model=> JSP (HTML(�±���)+JAVA)
//JSP (HTML(�±���) =>VIEW)
// JAVA => Model(1.VO ,2.DAO , 3.Manager)
//Controller �������ȿ����� �̹� ������ �Ǿ� ����
// => �۵� (�Ŵ��� ���� => XML) 
// �� Ŭ������ => Model ����
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
