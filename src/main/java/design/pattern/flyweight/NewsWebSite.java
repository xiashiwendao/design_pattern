package design.pattern.flyweight;

import design.pattern.utils.Utils;

public class NewsWebSite implements IWebsite {

	public void use(User user) {
		Utils.log("创建新闻网站，用户名称: " + user.UserName);
	}
}
