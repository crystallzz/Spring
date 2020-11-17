package com.sist.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecommendController {
	   @RequestMapping("recommend/list.do")
	   public String recommand_list()
	   {
		   return "recommend/list";
	   }
}