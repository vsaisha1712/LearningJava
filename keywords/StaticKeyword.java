package keywords;

// Static Keyword
public class StaticKeyword {
	
	int rollNo;
	String name;
	static String collegeName = "VIT";
	
	public StaticKeyword(int r,String n) {
		rollNo = r;
		this.name = n;
		}
	public void collegeRegistration() {
		System.out.println("College Registration == " + rollNo  + " :: " + name + " :: " + collegeName);
	}
	
	public static void main(String[] args) {
		StaticKeyword staticKeyword = new StaticKeyword(19,"Kavya");
		StaticKeyword staticKeyword1 = new StaticKeyword(7,"Ramya");
		staticKeyword.collegeRegistration();
		staticKeyword1.collegeRegistration();
	}

}
