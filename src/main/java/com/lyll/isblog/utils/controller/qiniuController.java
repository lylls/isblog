package com.lyll.isblog.utils.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qiniu.util.Auth;

@RestController
@RequestMapping("qiniu")
public class qiniuController {

	/**
	 * 简单的上传凭证
	 * @return
	 */
	@RequestMapping(value="uptoken",method=RequestMethod.GET)
	public String upToken(){
		
		String accessKey = "";
		String secretKey = "";
		String bucket = "lylltest";
		Auth auth = Auth.create(accessKey, secretKey);
		String upToken = auth.uploadToken(bucket);
		System.out.println(upToken);
		return upToken;
	}
}
