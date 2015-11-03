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
import com.logyin.ordering.common.dto.QuertItemRequest;
import com.logyin.ordering.common.dto.QuertItemResponse;
import com.logyin.ordering.service.ItemService;

@Controller
@RequestMapping("menu")
public class QueryItemController extends
		AbstractController<QuertItemRequest, QuertItemResponse> {
	private static final Logger logger = LoggerFactory
			.getLogger(QueryItemController.class);

	@Autowired
	private ItemService itemService;

	@Override
	@RequestMapping(value = "/queryItem", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
	public @ResponseBody
	String entry(@RequestBody QuertItemRequest req) {
		logger.info("queryItem request:{}", JSON.toJSONString(req, true));

		QuertItemResponse resp = new QuertItemResponse();

		resp = itemService.queryItem(req);

		String response = this.execute(req, resp);

		logger.info("queryItem response:{}", response);

		return response;
	}

	@Override
	public String handleRequest(QuertItemRequest req, QuertItemResponse resp) {
		return null;
	}

	@Override
	public String handleResponse(QuertItemRequest req, QuertItemResponse resp) {
		return JSON.toJSONString(resp, true);
	}

}
