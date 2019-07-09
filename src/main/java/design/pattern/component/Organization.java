package design.pattern.component;

import java.util.List;

public interface Organization {
	public String getName();

	public String function();

	public List<Organization> getSubOrg();
	
	public void addDepartment(Organization org);
}
