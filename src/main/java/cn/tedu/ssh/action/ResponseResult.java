package cn.tedu.ssh.action;



public class ResponseResult<T> {
    //��Ӧ״̬��
	private Integer state;
    //��Ӧ����Ϣ�����磺
	//-"��¼�ɹ�"
	//-����¼ʧ�ܣ��û���������
	//-����¼ʧ�ܣ��������
	//-��ע��ʧ�ܣ��û����Ѿ���ռ�ã�
	//-��ע��ʧ�ܣ��ֻ������Ѿ��������˺Ű�
	private String message;
	//��Ӧ������
	//������ĳ���û�����Ϣ�����û��б�����Ʒ�б�
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
