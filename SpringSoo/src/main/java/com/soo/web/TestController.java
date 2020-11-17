package com.soo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
@RequestMapping("test1/list.do")
public String test1_list()
{
	return "test1/list";
}
}
