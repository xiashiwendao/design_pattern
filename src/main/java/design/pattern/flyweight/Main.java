package design.pattern.flyweight;

public class Main {
	public static void main(String[] args) {
		IWebsite blogWebsite = FlyweightFactory.getWebSite("blog");
		blogWebsite.use(new User("Lorry"));
		blogWebsite.use(new User("Jim"));
	}
}
