package com.qaguru.training;

public class WeekCheck {

	
	public static void main(String[] args) {
		
		int i=7;
		
		while (i>0) { 
			if(i==1) {
			    System.out.println("The day of the week is monday");
			}
			else if (i==2) {
				System.out.println("The day of the week is Tuesday");
			}
			else if (i==3) {
				System.out.println("The day of the week is Wednesday");
			}
			else if (i==4) {
				System.out.println("The day of the week is Thursday");
			}
			else if (i==5) {
				System.out.println("The day of the week is Friday");
			}
			else if (i==6) {
				System.out.println("The day of the week is Saturday");
			}
			else if(i==7) {
				System.out.println("The day of the week is Sunday");
			}
			
			i= i-1;
		}
		
	}
}
