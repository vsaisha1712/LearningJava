package basics;

public class LoopsAndConditions {
	
	public static void main(String[] args) {
		
	int i = 19;
	
	// IfElse
	if (i < 6) {
		System.out.println("Infant");
	}
	else if (6<=i && i<15){
		System.out.println("Children");
	}
	else if (15<=i && i<24){
		System.out.println("Tennagers");
	}
	else if (24<=i && i<60){
		System.out.println("Middle aged");
	}
	else {
		System.out.println("Old aged");
	}
	
	// While loop
	int l = 1,sum = 0;
	while (l<=6) {
		l++;
		sum = sum + l;
	}
	System.out.println("Sum == " + sum);
	
	// DoWhile
	int k = 12;
	do {
		System.out.println("Implementing");
	}while(k>13);
	
	//ForLoop
	int d=0;
	int arr[] = {2,3,4,5,6};
	for(int s=0;s<=arr.length-1;s++) {
		System.out.println(arr[s]);
    }
	
	String name = "Dakshitha";
	for (char m:name.toCharArray() ) {
		if (m == 'h')
			System.out.println("Character == " + m);
	}
	
	// SwitchCase
	int marks = 100;
	switch(marks) {
	case 100:
		System.out.println("GradeA");
		break;
	case 60:
		System.out.println("GradeB");
		break;
    case 30:
	     System.out.println("GradeC");
	     break;
    default:
    	System.out.println("Fail");
	}
	
	int[] a = {1,2,3,4,5,6};
	for(int x : arr) {
		System.out.println(" x == " + x);
	}
}
}