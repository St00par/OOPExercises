package Results;

public class ExamResults {
	
	public static double Physics (double Phy){
		return Phy;
		}
	
	public static double Chemistry (double Chem) {
		return Chem;
		}
	
	public static double Biology (double Bio) {
		return Bio;
		}
	
	public static double Total (double Phy, double Chem, double Bio) {
		return (Phy+Chem+Bio);
		}
	
	public static double Percentage (double Phy, double Chem, double Bio) {
		return ((Phy+Chem+Bio)/4.50f);
		}	
	
	public static void Results (double Phy, double Chem, double Bio) {
		System.out.println("You Scored " +Phy +" out of 150.0 in your Physics exam.");
		if (Phy >90.0) {	
			System.out.println("You have passed Physics :)");
		} else { 
			System.out.println("You have failed Physics :(");
		}
		System.out.println("You Scored " +Chem +" out of 150.0 in your Chemistry exam.");
		if (Chem >90.0) {	
			System.out.println("You have passed Chemistry :)");
		} else { 
			System.out.println("You have failed Chemistry :(");
		}
		System.out.println("You Scored " +Bio +" out of 150.0 in your Biology exam.");
		if (Bio >90.0) {	
			System.out.println("You have passed Biology :)");
		} else { 
			System.out.println("You have failed Biology :(");
		}
	}

	public static void Overall (double Phy, double Chem, double Bio) {
		if ((Phy+Chem+Bio)/4.50f >= 60.0 && Phy >90.0 && Chem >90.0 && Bio >90.0) {	
			System.out.println("You have passed overall as you have passed all individual exams and reached an overall percentage above 60% - Congratulations :)");
		} else { 
			System.out.println("You have failed overall as you have failed at least one individual exam and/or not reached an overall percentage of 60% - Commiserations :(");
		}
	}
}
