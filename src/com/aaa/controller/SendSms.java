package com.aaa.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aaa.util.GetMessageCode;
/**
 * 
 * @Title:SendSms
 * @Description：接收页面传过来的电话号码
 * @author:罗雨
 * @Date 2017年12月10日 下午9:37:16
 */
@WebServlet("/sendSMS")
public class SendSms extends HttpServlet {
	 @Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String phone=req.getParameter("phone");
		//根据获取到的手机号发送验证码
		String code=GetMessageCode.getCode(phone); 
		System.out.println(code);
		resp.getWriter().print(code);
	}
}
