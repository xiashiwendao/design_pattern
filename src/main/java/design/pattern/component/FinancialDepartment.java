package design.pattern.component;

import java.util.ArrayList;
import java.util.List;

public class FinancialDepartment implements Organization {
	private List<Organization> departments = new ArrayList<Organization>();
	private String departmentName;

	public FinancialDepartment(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getName() {
		return departmentName;
	}

	public String function() {
		return "Just for financial";
	}

	public List<Organization> getSubOrg() {
		return null;
	}

	public void addDepartment(Organization org) {
		this.departments.add(org);
	}
}
