
package com.qstart.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * 类描述：本类为XX功能Controller类，主要实现XX的数据同步...
 *
 * @author Administrator
 * @date 2016年5月5日
 * 
 * 修改描述：本次修改了XX功能的同步逻辑...
 * @modifier Administrator 2016年5月5日
 */
 
@Controller
@RequestMapping("/test")
public class DemoController {
	
	@RequestMapping("/demo")
	public String demo(){
		
		System.out.println("...555.....");
		return "test/demo";
	}

}
