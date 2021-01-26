package student.opflow;

import java.util.Random;
import java.util.Scanner;

public class Program {


	public static void main(String[] args) {

		// Write your code here, to explore the use of operators and flow control.
		findLeapYear(); // excersise 1
		validateYearAndDate(); //excersise 2
		//Excercise 3
		Scanner scanner = new Scanner(System.in);
		System.out.print("input a year: ");
		int year = scanner.nextInt();
		System.out.print("\ninput a month: ");
		int month = scanner.nextInt();
		System.out.print("\nInput a date: ");
		int date = scanner.nextInt();
		if(isDateValid(year,date,month))
			System.out.println("Date is Valid");
		else
			System.out.println("Date is Not Valid");
	}


	private static boolean isDateValid(int year, int date, int month){
		//int date;
		//int year;
		//int month;
		boolean isValid;

			if(year<3000 && date!=0 && month!=0){
				if (date<28){
					//not so elegant solution,but got to test the continue
					//System.out.println("date (day.month.year):" + date + "." + month + "." + year + " is Valid");
					return true;
					//go out of for next iteration in the for loop here without continuing
				}
				//check if dates are correct for months
				switch (month){
					case 2:
						if (date<30 || (isLeapyear(year) && date<31) )
							isValid = true;
							//System.out.println("date (day.month.year):" + date + "." + month + "." + year + " is Valid");
						else
							isValid = false;
							//System.out.println("date (day.month.year):" + date + "." + month + "." + year + " is NOT Valid");
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						if(date<31)
							isValid = true;
							//System.out.println("date (day.month.year):" + date + "." + month + "." + year + " is Valid");
						else
							isValid = false;
							//System.out.println("date (day.month.year):" + date + "." + month + "." + year + " is NOT Valid");
						break;
					default:
						return true;
						//System.out.println("date (day.month.year):" + date + "." + month + "." + year + " is Valid");

				}

			}
			else{
				return false;
				//System.out.println("date (day.month.year):" + date + "." + month + "." + year + " is NOT valid");
			}
			return isValid;

	}
	private static void validateYearAndDate(){
		int date;
		int year;
		int month;
		Random random = new Random(); //making it possible to do some random stuff, even though its not quite random ;)
		for (int i=0;i<100;i++){
			//generate some random numbers
			date = random.nextInt(31);
			year = random.nextInt(3100);
			month = random.nextInt(13);



			//month=1;  testing purposes
			//year=2020; testing purposes
			//date=20; testing purposes


			if(year<3000 && date!=0 && month!=0){

				if (date<28){
					//not so elegant solution,but got to test the continue
					System.out.println("date (day.month.year):" + date + "." + month + "." + year + " is Valid");
					//go out of for next iteration in the for loop here without continuing
					continue;
				}
				//check if dates are correct for months
				switch (month){
					case 2:
						if (date<30 || (isLeapyear(year) && date<31) )
							System.out.println("date (day.month.year):" + date + "." + month + "." + year + " is Valid");
						else
							System.out.println("date (day.month.year):" + date + "." + month + "." + year + " is NOT Valid");
						break;


						case 4:
						case 6:
						case 9:
						case 11:
						if(date<31)
							System.out.println("date (day.month.year):" + date + "." + month + "." + year + " is Valid");
						else
							System.out.println("date (day.month.year):" + date + "." + month + "." + year + " is NOT Valid");

						break;


					default:
						System.out.println("date (day.month.year):" + date + "." + month + "." + year + " is Valid");

				}
			}
			else{
				System.out.println("date (day.month.year):" + date + "." + month + "." + year + " is NOT valid");
			}
		}
	}

	private static boolean isLeapyear(int year){
		if(year%400==0 || (year%4==0 && year%100!=0 ))
			return true;
		else
			return false;

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
