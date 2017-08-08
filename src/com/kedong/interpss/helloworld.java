/* 
 * Java file created by Chenjie
 *
 * Created on 2017年8月2日
 * Copyright 2017 Beijing Kedong Electrical Control System Ltd. Co.
 * All rights reserved.
 */
/**
 * 
 */
package com.kedong.interpss;
import java.util.Date;

import java.util.Date;

/**
 * Chejie's Type
 *
 * @author cj
 * @version 1.0, 2017年8月2日
 * Copyright 2017 Beijing Kedong ELectrical Control System Ltd. Co.
 * All rights reserved.
 */
public class helloworld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World！");
		//comment in git shell
		int Idflag=1;
		String info;
		info="id is "+Idflag;
		System.out.println("Hello World2！");
		System.out.println("Hello World3！");
		System.out.println("Hello World4！");
		System.out.println("after hello2, add hello5");
		System.out.println("Today is Aug 7,2017,Monday, add Hello6!");
		
		Date date=new Date();
		Run(date);
	}
	public static void Run(Date date) {
		System.out.println("Today is "+date.toString());
	}

}
