package cn.tedu.ssh.action.bean;

public class User {
    private Integer id;
	private String username;
	private String password;
    private String eamil;
    private String mobilePhoneNumber;
    
    public User(){
    	
    }
	public User(int i, String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", eamil=" + eamil
				+ ", mobilePhoneNumber=" + mobilePhoneNumber + "]";
	}

}
