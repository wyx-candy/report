package report;

import java.util.Date;

public class ill {
	
    private int id;
    private String contact;
    private String confirm;
    private Date date;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getContact() {
        return contact;
    }
    public void setCreator(String contact) {
        this.contact = contact;
    }
    
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	
    public Date getDate() {
        return date;
    }
    public void setCreateTime(Date date) {
        this.date = date;
    }
    
    public ill(int id, String contact, String confirm,Date date) {
        super();
        this.id = id;
        this.contact = contact;
        this.confirm = confirm;
        this.date = date;
    }
    
}
