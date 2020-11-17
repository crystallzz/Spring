package com.soo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test2Controller {
@RequestMapping("test2/list.do")
public String test1_list()
{
	return "test2/list";
}
}
