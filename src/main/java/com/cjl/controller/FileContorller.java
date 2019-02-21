package com.cjl.controller;

import com.cjl.model.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

/**
 * Created by Administrator on 2019/2/20.
 */
@Controller
@RequestMapping("file")
public class FileContorller {

	@ResponseBody
	@RequestMapping(value = "upload.do",method = RequestMethod.POST)
	public ModelAndView upload(MultipartFile   upload) {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("redirect:../success.jsp");
		return modelAndView;
	}


	@RequestMapping(value="/download",method=RequestMethod.GET) //匹配的是href中的download请求
	public String download( HttpServletRequest request,
						   HttpServletResponse response) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("multipart/form-data");
		response.setHeader("Content-Disposition", "attachment;fileName="
				+ "temp.txt");
		try {
			String path = request.getSession().getServletContext().getRealPath
					("image")+File.separator;
			InputStream inputStream = new FileInputStream(new File(path
					+ "temp.txt"));

			OutputStream os = response.getOutputStream();
			byte[] b = new byte[2048];
			int length;
			while ((length = inputStream.read(b)) > 0) {
				os.write(b, 0, length);
			}

			// 这里主要关闭。
			os.close();
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//  返回值要注意，要不然就出现下面这句错误！
		//java+getOutputStream() has already been called for this response
		return null;
	}
}
