package day2;

public class NestedIfElse {
public static void main(String[]args) {
	int a=24;
	if(a%2==0) {
		System.out.println("even no");
		if(a%6==0) {
			System.out.println("divisibe by 6");
		}
		else {
			System.out.println("not divisible by 6");
		}
	}
   else {
				System.out.println("odd");
			}
				
			}	
}

