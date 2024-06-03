package week1.day2;

public class Browser {
	public String LaunchBrowser(String browsername) {
		System.out.println("Browser launched successfully");
		return browsername;
	}
	public void LoadUrl() {
		System.out.println("Application url loaded successfully");
	}

public static void main(String[] args) {
	Browser methods=new Browser();
	methods.LoadUrl();
	String Browser=methods.LaunchBrowser("Chrome");
	System.out.println("Returned browser name:"+ Browser);
}
}
	
	

