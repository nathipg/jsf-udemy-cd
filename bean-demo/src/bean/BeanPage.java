package bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class BeanPage {
	
	private String page;

	public BeanPage() {
	}
	
	public String redirectPage() {
		return page;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
}