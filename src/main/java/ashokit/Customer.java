package ashokit;

import lombok.Data;

@Data
public class Customer {

	private Integer cid;
	
	private String cname;
	
	
	private String cmail;


	
	
	public Customer(Integer cid, String cname, String cmail) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cmail = cmail;
	}


	public Integer getCid() {
		return cid;
	}


	public void setCid(Integer cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getCmail() {
		return cmail;
	}


	public void setCmail(String cmail) {
		this.cmail = cmail;
	}
	
}
