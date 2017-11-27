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
		//����˴������ǳɹ��ģ��ȴ�����Ӧ����������
		User user = new User(9527,"������","zhou9527","30224300302","zhouxinxgxing@tedu.cn");
		//����ͨ�õ���Ӧ���
		responseResult = new ResponseResult<User>();
		responseResult.setState(1);
		responseResult.setDate(user);
		setQuery("full-result");
		//��Ҫ������
		if("full-result".equals(query)){
			return "full-result";
		}else{
			return "error";
		}
	}

}
