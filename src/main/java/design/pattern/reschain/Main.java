package design.pattern.reschain;

public class Main {

	public static void main(String[] args) {
		Boss boss = new Boss();
		Supervisor sup = new Supervisor();
		sup.setSuccessor(boss);
		DeparmentMgr depmgr = new DeparmentMgr();
		depmgr.setSuccessor(sup);

		Integer[] leaveDays = { 1, 7, 15 };
		for (int dayCount : leaveDays) {
			Request request = new Request();
			request.requestType = "leave";
			request.leaveDays = dayCount;

			depmgr.handleApplication(request);
		}
	}
}
