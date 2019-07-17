package design.pattern.flyweight;

import design.pattern.utils.Utils;

public class BlogWebsite implements IWebsite {

	public void use(User user) {
		Utils.log("创建博客网站，用户名称: " + user.UserName);
	}
}
