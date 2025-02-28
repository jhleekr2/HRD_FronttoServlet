package web.dto;

public class Member {

	private String userid;
	private String userpw;
	private String usernick;
	
	public Member() {}

	public Member(String userid, String userpw, String usernick) {
		super();
		this.userid = userid;
		this.userpw = userpw;
		this.usernick = usernick;
	}

	@Override
	public String toString() {
		return "Member [userid=" + userid + ", userpw=" + userpw + ", usernick=" + usernick + "]";
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public String getUsernick() {
		return usernick;
	}

	public void setUsernick(String usernick) {
		this.usernick = usernick;
	}
	
	
}
