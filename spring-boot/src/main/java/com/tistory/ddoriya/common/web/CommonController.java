/*
 * @(#) CommonController.java 2019. 11. 20.
 *
 * Copyright 2019. ddoriya. All rights Reserved.
 */
package com.tistory.ddoriya.common.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 이상준
 */
@Controller
@RequestMapping("/common")
@Slf4j
public class CommonController {

	@RequestMapping("/test")
	public ResponseEntity<Map<String, Object>> info() {
		Map<String, Object> map = new HashMap<>();
		map.put("Hello World", "Hello World");
		return new ResponseEntity(map, HttpStatus.OK);
	}

	@RequestMapping("/jun")
	public ResponseEntity<Map<String, Object>> test() {
		Map<String, Object> map = new HashMap<>();
		map.put("userId", "jun");
		map.put("seq", "1");
		map.put("userName", "이상준");

		return new ResponseEntity(map, HttpStatus.OK);
	}
}
