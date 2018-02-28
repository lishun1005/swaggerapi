package com.lishun.controller;

import com.lishun.entity.Users;
import com.lishun.result.ResultBean;
import com.lishun.result.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author lishun
 * @Description: TODO
 * @date 2018/2/7
 */

@RestController
@Api(tags = { "index" })
public class IndexController {

	@GetMapping("/index/{id}")
	@ApiOperation(value = "findByOne", notes = "获取一条数据")
	public ResultBean<String> findByOne(@PathVariable(value = "id") String id) {
		ResultBean<String> resultBean = new ResultBean<>();
		resultBean.setCode(ResultCode.OK);
		resultBean.setResultData("请求成功");
		return resultBean;
	}
	@PostMapping("/index/add")
	@ApiOperation(value = "add", notes = "新增")
	public ResultBean<String> add(Users users) {
		ResultBean<String> resultBean = new ResultBean<>();
		resultBean.setCode(ResultCode.OK);
		resultBean.setResultData("请求成功");
		return resultBean;
	}
	@DeleteMapping("/index/delete/{id}")
	@ApiOperation(value = "delete", notes = "删除")
	public ResultBean<String> delete(@PathVariable(value = "id") String id) {
		ResultBean<String> resultBean = new ResultBean<>();
		resultBean.setCode(ResultCode.OK);
		resultBean.setResultData("请求成功");
		return resultBean;
	}
}
