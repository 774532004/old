package cn.tedu.ssh.action;



public class ResponseResult<T> {
    //响应状态码
	private Integer state;
    //响应的消息，例如：
	//-"登录成功"
	//-“登录失败！用户名不存在
	//-“登录失败！密码错误
	//-“注册失败！用户名已经被占用！
	//-“注册失败！手机号码已经被其它账号绑定
	private String message;
	//响应的数据
	//可能是某个用户的信息，或用户列表，或商品列表
	private T date;
	
	public ResponseResult() {
		super();
	}
	public ResponseResult(Integer state, String message) {
		super();
		this.state = state;
		this.message = message;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getDate() {
		return date;
	}
	public void setDate(T date) {
		this.date = date;
	}
	public static void main(String[] args) throws InterruptedException {
    	Thread thread = new Thread();
    	thread.getPriority();
    	Object obj = new Object();
    	obj.wait();
	}
}
