package design.pattern.component;

import java.util.ArrayList;
import java.util.List;

public class Company implements Organization {
	private String companyName;
	private List<Organization> departments = new ArrayList<Organization>();

	public Company(String companyName) {
		this.companyName = companyName;
	}

	public String getName() {
		return this.companyName;
	}

	public String function() {
		return "I'm a company, the container of Department";
	}

	public List<Organization> getSubOrg() {
		return departments;
	}

	public void addDepartment(Organization org) {
		this.departments.add(org);
	}
}
