package cn.tedu.ssh.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import cn.tedu.ssh.action.bean.User;

public class ResponseResultAction implements SessionAware{
    private String query;
    private Map<String,Object> session;
    private ResponseResult<User> responseResult;
    private String state;
    
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public ResponseResult<User> getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult<User> responseResult) {
		this.responseResult = responseResult;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public ResponseResultAction() {
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public String execute(){
		//假设此次请求是成功的，先创建响应的数据内容
		User user = new User(9527,"周星星","zhou9527","30224300302","zhouxinxgxing@tedu.cn");
		//创建通用的响应结果
		responseResult = new ResponseResult<User>();
		responseResult.setState(1);
		responseResult.setDate(user);
		setQuery("full-result");
		//需要创建的
		if("full-result".equals(query)){
			return "full-result";
		}else{
			return "error";
		}
	}

}
