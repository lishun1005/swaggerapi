package com.lishun.result;

import java.io.Serializable;
import java.util.List;

/**
 * @author lishun
 * @Description: TODO
 * @date 2017/10/24
 */
public class ResultBean<T> implements Serializable {
	/*提示信息*/
	public String message = "";
	/*状态码*/
	public Integer code;
	/*总页数*/
	private long totalPage;
	/*页容量*/
	private int pages;
	/*页码*/
	private int pageNum;
	/*返回实体信息*/
	private T resultData;
	/*返回集合实体信息*/
	private List<T> resultDataList;

	public ResultBean() {
	}

	public ResultBean(List<T> resultData, long totalPage, int pages, int pageNum) {
		this.resultDataList = resultData;
		this.totalPage = totalPage;
		this.pages = pages;
		this.pageNum = pageNum;
	}

	public ResultBean(T resultData) {
		this.resultData = resultData;
	}


	public void setMessage(String message) {
		this.message = message;
	}

	public long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}


	public List<T> getResultDataList() {
		return resultDataList;
	}

	public void setResultDataList(List<T> resultDataList) {
		this.resultDataList = resultDataList;
	}


	public void setMessage(String message, Object... args) {
		this.message = String.format(message, args);
	}

	public String getMessage() {
		return message;
	}

	public void setResultData(T resultData) {
		this.resultData = resultData;
	}

	public T getResultData() {
		return this.resultData;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public <T> void setResultBean(Integer code, String message,
	                              Object... mesaageFormatArgs) {
		setCode(code);
		setMessage(message, mesaageFormatArgs);
	}
}
