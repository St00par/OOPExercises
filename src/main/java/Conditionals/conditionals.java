package Conditionals;

public class conditionals {

	
	public void input(int num1, int num2, boolean bool) {
		
		if (num1%2==0){ 
			System.out.println(0);
		} else if (num2%2==0){ 
			System.out.println(0);		
		} else if (bool==true) {
			System.out.println(num1+num2);
		} else if (bool==false) {
			System.out.println(num1*num2);
	}
	} 	
}
