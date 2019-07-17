package design.pattern.flyweight;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import design.pattern.utils.Utils;

public class FlyweightFactory {
	private static Hashtable<String, IWebsite> dic = new Hashtable<String, IWebsite>();

	public static IWebsite getWebSite(String websiteType) {
		IWebsite website = null;
		if (!dic.contains(websiteType)) {
			Utils.log("该网站类型不存在");
			website = websiteType == "news" ? new NewsWebSite() : new BlogWebsite();
			dic.put(websiteType, website);
		} else {
			website = dic.get(websiteType);
		}

		return website;
	}
}
