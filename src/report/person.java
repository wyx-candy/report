package report;

public class person {
	private int id;
    private String name;
    private String zhiye;
    private String sex;
    private String college;
    private String hubei;
    private String wuhan;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getZhiye() {
		return zhiye;
	}
	public void setZhiye(String zhiye) {
		this.zhiye = zhiye;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	public String getHubei() {
		return hubei;
	}
	public void setHubei(String hubei) {
		this.hubei = hubei;
	}
	
	public String getWuhan() {
		return wuhan;
	}
	public void setWuhan(String wuhan) {
		this.wuhan = wuhan;
	}
    
	public person(int id, String name, String zhiye, String sex, String college, String hubei, String wuhan) {
        super();
        this.id = id;
        this.name = name;
        this.zhiye = zhiye;
        this.sex = sex;
        this.college = college;
        this.hubei = hubei;
        this.wuhan = wuhan;
	}
}
