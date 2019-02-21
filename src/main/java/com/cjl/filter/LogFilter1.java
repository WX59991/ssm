package com.cjl.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2019/2/21.
 */
public class LogFilter1 extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
		String url=httpServletRequest.getRequestURL().toString();
		if(url.indexOf("error")!=-1){
			System.out.println("过滤器");
			httpServletRequest.getRequestDispatcher("/save.jsp").forward( httpServletRequest,httpServletResponse);
		}
		filterChain.doFilter(httpServletRequest,httpServletResponse);
	}
}
