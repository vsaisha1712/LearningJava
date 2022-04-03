package keywords;

public class ChildUpcasting extends ParentUpcasting{
	
	public void exercise() {
		System.out.println("Exercise makes body healthy");
	}
	
	public static void main(String[] args) {
		
		// Upcasting
		ParentUpcasting ParentUpcasting = new ChildUpcasting();
		ParentUpcasting.eating();
		
		//Downcasting
		ChildUpcasting childUpcasting = (ChildUpcasting) ParentUpcasting;
		childUpcasting.exercise();
	}

}
