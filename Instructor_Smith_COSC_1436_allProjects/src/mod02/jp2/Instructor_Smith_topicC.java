package mod02.jp2;

import java.util.Scanner;

public class Instructor_Smith_topicC {

	public static void main (String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//2.2.1 - data

		// Data literals
		String patientFirstName = "Punjan";
		String patientLastName = "Subedi";
		String patientStreetAddressName = "5758 gulfton street";
		String patientCity = "Houston";
		String patientState = "Texas";

		// 12 data variables related to the program
		int patientCountNumber = 0 ;
		long patientIDNumber = 0;
		short patientStreetAddressNumber = 0;
		int patientZipCode = 0;
		byte patientPainLevel = 0;
		byte patientPainLocation = 0;
		byte patientPainType = 0;
		int points = 0;
		double patientDiscountRate = 0;
		final float TAXES_FEES = 0.025f;
		float patientCost = 0.00f;
		float total = 0.00f;
		
		//2.2.2 - user menu and signup selection data variables
		byte selectorMainMenu_s1 = 0;
		byte selectorSignUp_s2 = 0;
		
		
		//program-section 
		//3.1
		System.out.println("Hi, Welcome to Nepal County Hospital. The mission  of the Nepal County Hospital Foundation is to raise awareness and funds for the Nepal Health System. Since 1992, the organization has been able to provide over 120 million dollars in grants to the health system. These grants have been used to support various programs and services within the community. Some of these include cancer care, children's health, equipment, and nursing education. ");
		System.out.println(" The organization is dedicated to supporting the efforts of the doctors, nurses, and staff members of the health system, which is composed of several hospitals and clinics. These facilities provide a wide range of services and programs.");
		System.out.println(" The success of the NCH Foundation can be attributed to the contributions of its supporters. These individuals have participated in various events and activities.");
		System.out.println(" The NCH Foundation would like to express its gratitude to its many supporters, donors, volunteers, and sponsors. Without their continuous support, the organization would not be able to carry out its activities.");
		
		//3.2
		System.out.println(" The program I am writing on is of County Hospital Java Project. A hospital management system is a computerized system that handles various aspects of a hospital's operations, such as staffing, billing, and complaints. ");
		System.out.println(" Apart from its software, this system stores the hardware assets of the organization. It will also keep track of various details about its employees and patients.");
		System.out.println(" This project utilizes a GUI-based software that will allow users to access and update information.");
		
		//3.3
		System.out.println("Welcome to Main Menu_1.");
		System.out.println("________");
		System.out.println(" 1 - SignUp");
		System.out.println(" 2 - LogIn (not Available)");
		System.out.println(" 3 - Exit (not Available)");
		
		//3.4
		System.out.println("[Main Menu] Please select 1, 2, or 3 :");
		selectorMainMenu_s1 = userInput.nextByte();
		System.out.println("*User Entered(selectorMainMenu_s1) = " + selectorMainMenu_s1);
		
		//3.5
		System.out.println("Sign Up Menu _ 2");
		System.out.println("________");
		System.out.println(" 1 - Add Patient");
		System.out.println(" 2 - Add Doctor (not Available)");
		System.out.println(" 3 - Add Adminstrator (not Available)");
		System.out.println(" 4 - Exit (not Available)");
		
		//3.6
		System.out.println("[Sign Up] Please select 1, 2, or 3 :");
		selectorSignUp_s2 = userInput.nextByte();
		System.out.println("*User Entered(selectorSignUp_s2) = " + selectorSignUp_s2);

		//3.7
		System.out.println("Add Patient Menu _ 3. ");
		patientCountNumber++;
		System.out.println("1. <patientCountNumber++ > Patient's Count# = "+ patientCountNumber);
		System.out.println("2. <User Input> must enter the Patient's ID# (ex. (123456789-" + "987654321) = 2022156");
		patientIDNumber = userInput.nextLong();

		System.out.println("3. <Literal> Patient's First Name : " + patientFirstName);
		System.out.println("4. <Literal> Patient's Last Name : " + patientLastName);
		System.out.println("5. <User Input> Patient's Street Address Number (ex. (1-25000) = 202):");

		patientStreetAddressNumber = userInput.nextByte();

		System.out.println("6. <Literal> Patient's Street Address Name : " + patientStreetAddressName);
		System.out.println("7. <Literal> Patient's City :" + patientCity);
		System.out.println("8. <Literal> Patient's State : " + patientState);
		System.out.println("9. <User Input> Patient's Zip Code (ex. (11111-99999) = 77002):");
		patientZipCode = userInput.nextByte();

		System.out.println("10. <User Input> Patient's Pain Level (ex. (1-10) = 6)");
		patientPainLevel = userInput.nextByte();

		System.out.println("11. <User Input> Patient's Pain Location Number Select body location # below: \n 7. Head \n 6. Chest. Head \n 5. Stomach \n 4. Arms \n 3. Leg \n 2. Hand \n 1. Foot");
		patientPainLocation = userInput.nextByte();

		System.out.println("12.  <User Input> Patient's Pain Type :\n Select side of pain # below: \n 3 - External/Open Wound & Internal/Pain inside skin\n 2 - External/Open Wound\n1 - Internal/Pain inside skin");
		patientPainType = userInput.nextByte();

		points = patientPainLevel + patientPainLocation + patientPainType;
		System.out.println("13. <patientPainLevel + patientPainLocation + patientPainType>\n Patient's Total Points :" + points);

		System.out.println("14.<User Input> Patient's Discount Rate (ex. (1-100) = 25):" );
		patientDiscountRate = userInput.nextByte();

		System.out.println("15. <TAXES_FEES> Patient's Taxes and Fees (TAXES_FEES): " + TAXES_FEES);
		System.out.println("16. <User Input> Patient's Cost (ex. (1.00-999999.99) = 1256.23): ");

		patientCost = userInput.nextByte();

		total =(float)( (TAXES_FEES*patientCost)+((patientDiscountRate/100)*patientCost)+(patientCost) ); 
		System.out.println("17.<(((TAXES_FEES) * patientCost) + ((patientDiscountRate / 100) * patientCost) patientCost)> Patient's Total Total : " + total);
		
		//3.8
		System.out.println("OutPut/Results of Program\n" +
				"--------------------------\n" +
				"//////// New Patient - Sign Up : Receipt //////\n" +
				"1. Patient's Count Number = " + patientCountNumber + "\n" +
				"2. Patient's ID Number = " + patientIDNumber + "\n" +
				"3. Patient's First Name = " + patientFirstName + "\n" +
				"4. Patient's Last Name = " + patientLastName + "\n" +
				"5. Patient's Street Address Number = " + patientStreetAddressNumber + "\n" +
				"6. Patient's Street Address Name = " + patientStreetAddressName + "\n" +
				"7. Patient's City = " + patientCity + "\n" +
				"8. Patient's State = " + patientState + "\n" +
				"9. Patient's Zip Code = " + patientZipCode + "\n" +
				"10. Patient's Pain Level = " + patientPainLevel + "\n" +
				"11. Patient's Pain Location = [" + patientPainLocation + "priority level ] (1-low\n" +
				"priority through 7-high priority\n" +
				"12. Patient's Pain Type = [ " + patientPainType + " priority level ] (1-low priority\n" +
				"through 7-high priority)\n" +
				"13. Patient's Total Points = " + points + "\n" +
				"14. Patient's Discount Rate = " + patientDiscountRate + "\n" +
				"15. Patient's Taxes and Fees = " + TAXES_FEES + "\n" +
				"16. Patient's Cost = " + patientCost + "\n" +
				"17. Patient with an ID of [" +patientIDNumber +"] owes [$" + total +"] for pain\n" +
				"point count total of [" + points + "] out of 20");

		//3.9
		System.out.println("");
		System.out.println("===== Thank You For Choosing NCH =====");
	    System.out.println("Patient Account has been Created ");
	    System.out.println("Patient ID# "+patientIDNumber);
		System.out.println("Thank You. Take care!");
		System.out.println("");

		userInput.close();
	}
}
