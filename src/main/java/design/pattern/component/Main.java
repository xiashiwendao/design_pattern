package design.pattern.component;

import java.util.List;

import design.pattern.utils.Utils;

public class Main {
	public static void main(String[] args) {
		Company c = new Company("Accenture");
		RegionSubCompany rsc = new RegionSubCompany("Northest Company");
		c.addDepartment(rsc);
		FinancialDepartment fd = new FinancialDepartment("Northest Company Financial");
		rsc.addDepartment(fd);
		
		
		List<Organization> lst = c.getSubOrg();
		Utils.log(c.getName());
		for(Organization org : lst) {
			Utils.log(org.getName());
			List<Organization> subList = org.getSubOrg();
			if(subList != null && subList.size() > 0) {
				for(Organization subOrg : subList) {
					Utils.log(subOrg.getName());
				}
			}
		}
	}
}
