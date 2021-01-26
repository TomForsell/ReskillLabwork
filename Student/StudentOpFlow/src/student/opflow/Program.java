package student.opflow;

public class Program {


	public static void main(String[] args) {

		// Write your code here, to explore the use of operators and flow control.
		findLeapYear();

	}


	private static void findLeapYear() {
		//int day = 1;
		//int month=1;

		System.out.println("These are the years between 1900 and 2021 that are leap years: ");
		for (int year=1900; year<=2021;year++ ){
			//|| (year%4==0 && year%100!=0 )
			if(year%400==0 || (year%4==0 && year%100!=0 )){
				System.out.println("year: " +year);
			}

		}
	}
}
