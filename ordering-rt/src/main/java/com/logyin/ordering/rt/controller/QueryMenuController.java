package com.logyin.ordering.rt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.logyin.ordering.common.dto.QuertMenuRequest;
import com.logyin.ordering.common.dto.QuertMenuResponse;
import com.logyin.ordering.service.MenuService;

@Controller
@RequestMapping("menu")
public class QueryMenuController extends
		AbstractController<QuertMenuRequest, QuertMenuResponse> {
	private static final Logger logger = LoggerFactory
			.getLogger(QueryMenuController.class);

	@Autowired
	private MenuService menuservice;

	@Override
	@RequestMapping(value = "/queryMenu", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
	public @ResponseBody
	String entry(@RequestBody QuertMenuRequest req) {
		logger.info("queryMenu request:{}", JSON.toJSONString(req, true));

		QuertMenuResponse resp = new QuertMenuResponse();

		resp = menuservice.queryMenu(req);

		String response = this.execute(req, resp);

		logger.info("queryMenu response:{}", response);

		return response;
	}

	@Override
	public String handleRequest(QuertMenuRequest req, QuertMenuResponse resp) {
		return null;
	}

	@Override
	public String handleResponse(QuertMenuRequest req, QuertMenuResponse resp) {
		return JSON.toJSONString(resp, true);
	}

}
