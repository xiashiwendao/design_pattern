package design.pattern.component;

import java.util.ArrayList;
import java.util.List;

public class RegionSubCompany implements Organization {
	private String regionSubCompany;
	private List<Organization> departments = new ArrayList<Organization>();

	public RegionSubCompany(String regionSubCompany) {
		this.regionSubCompany = regionSubCompany;
	}

	public String getName() {
		return regionSubCompany;
	}

	public String function() {
		return "Manage some region";
	}

	public List<Organization> getSubOrg() {
		return this.departments;
	}

	public void addDepartment(Organization org) {
		this.departments.add(org);
	}
}
