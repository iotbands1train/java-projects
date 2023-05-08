package cosc1436.crn13271.summer2022.module07.module08;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class JP5_Mod07_Mod08 {

    public static void aboutNCH() {
        //program-section
        System.out.println("Hi, Welcome to Nepal County Hospital. The mission  of the Nepal County Hospital Foundation is to raise awareness and funds for the Nepal Health System. Since 1992, the organization has been able to provide over 120 million dollars in grants to the health system. These grants have been used to support various programs and services within the community. Some of these include cancer care, children's health, equipment, and nursing education. ");
        System.out.println(" The organization is dedicated to supporting the efforts of the doctors, nurses, and staff members of the health system, which is composed of several hospitals and clinics. These facilities provide a wide range of services and programs.");
        System.out.println(" The success of the NCH Foundation can be attributed to the contributions of its supporters. These individuals have participated in various events and activities.");
        System.out.println(" The NCH Foundation would like to express its gratitude to its many supporters, donors, volunteers, and sponsors. Without their continuous support, the organization would not be able to carry out its activities.");

        System.out.println(" The program I am writing on is of County Hospital Java Project. A hospital management system is a computerized system that handles various aspects of a hospital's operations, such as staffing, billing, and complaints. ");
        System.out.println(" Apart from its software, this system stores the hardware assets of the organization. It will also keep track of various details about its employees and patients.");
        System.out.println(" This project utilizes a GUI-based software that will allow users to access and update information.");

    }

    public static byte mainMenuSelection1(Scanner userInput) {
        System.out.println("Welcome to Main Menu_1.");
        System.out.println("________");
        System.out.println(" 1 - SignUp");
        System.out.println(" 2 - LogIn ");
        System.out.println(" 3 - Exit ");

        System.out.println("[Main Menu] Please select 1, 2, or 3 :");
        return userInput.nextByte();
    }

    public static byte signupMenuSelection(Scanner userInput) {
        System.out.println("Sign Up Menu _ 2");
        System.out.println("________");
        System.out.println(" 1 - Add Patient");
        System.out.println(" 2 - Add Doctor ");
        System.out.println(" 3 - Add Adminstrator ");
        System.out.println(" 4 - Exit ");

        System.out.println("[Sign Up] Please select 1, 2, or 3 :");
        return userInput.nextByte();
    }

    public static byte addPatientSelector(Scanner userInput){
        System.out.println("How to create patient: ");
        System.out.println("1 - Add Patient : Auto generated ");
        System.out.println("2 - Add Patient : user inputs ");

       return userInput.nextByte();
    }

    public static String getPatientFirstname(){
        try {
            Scanner read = new Scanner(new File("firstNames_100"));
            String data = "";
            while (read.hasNextLine()) {
                data += read.nextLine() + ":";
            }
            int count = 0;
            for (int j = 0; j < data.length(); j++) {
                count++;
                if (j < data.length() - 1) {
                    data = data.substring(data.indexOf(":") + 1);
                }
            }
            int random = (int) (Math.random() * count);
            String d = "";
            d = data.substring(random);
            d = d.substring(d.indexOf(":") + 1);
            d = d.substring(0, d.indexOf(":"));
            return d;
        } catch (Exception e) {
            return null;
        }
    }

    public static String getPatientLastname(){
        try {
            Scanner read = new Scanner(new File("lastNames_100"));
            String data = "";
            while (read.hasNextLine()) {
                data += read.nextLine() + ":";
            }
            int count = 0;
            for (int j = 0; j < data.length(); j++) {
                count++;
                String d = data.substring(0, data.indexOf(":"));
                if (j < data.length() - 1) {
                    data = data.substring(data.indexOf(":") + 1);
                }
            }
            int random = (int) (Math.random() * count);
            String d = "";
            d = data.substring(random);
            d = d.substring(d.indexOf(":") + 1);
            d = d.substring(0, d.indexOf(":"));
            return d;
        } catch (Exception e) {
            return null;
        }
    }

    public static String getPatientStreetAddressName(){
        try {
            Scanner read = new Scanner(new File("streetAddress_100"));
            String data = "";
            while (read.hasNextLine()) {
                data += read.nextLine() + ":";
            }
            int count = 0;
            for (int j = 0; j < data.length(); j++) {
                count++;
                String d = data.substring(0, data.indexOf(":"));
                if (j < data.length() - 1) {
                    data = data.substring(data.indexOf(":") + 1);
                }
            }
            int random = (int) (Math.random() * count);
            String d = "";
            d = data.substring(random);
            d = d.substring(d.indexOf(":") + 1);
            d = d.substring(0, d.indexOf(":"));
            return d;
        } catch (Exception e) {
            return null;
        }
    }

    public static String getPatientCity(){
        try {
            Scanner read = new Scanner(new File("city_100"));
            String data = "";
            while (read.hasNextLine()) {
                data += read.nextLine() + ":";
            }
            int count = 0;
            for (int j = 0; j < data.length(); j++) {
                count++;
                String d = data.substring(0, data.indexOf(":"));
                if (j < data.length() - 1) {
                    data = data.substring(data.indexOf(":") + 1);
                }
            }
            int random = (int) (Math.random() * count);
            String d = "";
            d = data.substring(random);
            d = d.substring(d.indexOf(":") + 1);
            d = d.substring(0, d.indexOf(":"));
           return d;
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }

    public static String getPatientState(){
        try {
            Scanner read = new Scanner(new File("states_100"));
            String data = "";
            while (read.hasNextLine()) {
                data += read.nextLine() + ":";
            }
            int count = 0;
            for (int j = 0; j < data.length(); j++) {
                count++;
                String d = data.substring(0, data.indexOf(":"));
                if (j < data.length() - 1) {
                    data = data.substring(data.indexOf(":") + 1);
                }
            }
            int random = (int) (Math.random() * count);
            String d = "";
            d = data.substring(random);
            d = d.substring(d.indexOf(":") + 1);
            d = d.substring(0, d.indexOf(":"));
           return d;
        } catch (Exception e) {
            // TODO: handle exception
       return null;
        }
    }

    public static void saveToDatabase(String data){
        try {
            File f = new File("database");
            PrintWriter pw = new PrintWriter(f);
            if (f.exists()) {
                FileWriter fw = new FileWriter(f);
                pw = new PrintWriter(fw);
            }
            pw.print(data);
            pw.close();

        } catch (Exception e) {

        }
    }

    public static boolean shouldAddNextPatient(Scanner userInput){
        // 9.2
        System.out.println("Now, what would you like to do now? : ");
        System.out.println("1- Add another patient to the databse");
        System.out.println("2- Add current patient and Exit ");
        int answer = userInput.nextInt();
        if (answer == 1) {
            return true;
        }
        else
        return false;
    }

    public static int getSignupReturnResponseFromUser(Scanner userInput){
        System.out.println("Would you like to :");
        System.out.println(" 1 - Return to Sign Up menu");
        System.out.println(" 2 - Return to Main Menu");
        return userInput.nextInt();
    }

    public static void login(Scanner userInput){
        boolean runLogIn = true;
        while (runLogIn) {
            String userNameDatabase = "Rambo21";
            System.out.println("Enter your username: ");
            String userNameUserInput = userInput.next();
            if (userNameUserInput.equals(userNameDatabase)) {
                String passwordDatabase = "Bat21#good!";
                System.out.println("Enter your Password: ");
                String passwordNameUserInput = userInput.next();
                if (passwordNameUserInput.equals(passwordDatabase)) {
                    System.out.println("Access Granted - Log In successful");
                    System.out.println("Log-In Screen");
                } else {
                    System.out.println(passwordNameUserInput + " , does not match the password in the database for " + userNameDatabase);
                }
            } else {
                System.out.println(userNameUserInput + " , doesnot not exist in the database");
            }
        runLogIn = shouldRunLogin(userInput);
        }
    }

    public static boolean shouldRunLogin(Scanner userInput){
        System.out.println("Would you like to :");
        System.out.println(" 1 - Return to Log In menu");
        System.out.println(" 2 - Return to Main Menu");
        int ans = userInput.nextInt();
     return ans == 1 ? true : false;
    }

    public static String generatePatientPassword(){
        return (char) (Math.random() * (90 - 65) + 65) + "" +
                (char) (Math.random() * (122 - 97) + 97) + "" +
                (char) (Math.random() * (122 - 97) + 97) + "" +
                (char) (Math.random() * (122 - 97) + 97) + "" +
                (char) (Math.random() * (122 - 97) + 97) + "" +
                (char) (Math.random() * (122 - 97) + 97) + "" +
                (char) (Math.random() * (36 - 33) + 33) + "" +
                (char) (Math.random() * (57 - 48) + 48) + "" +
                (char) (Math.random() * (57 - 48) + 48);
    }

    public static float calculateTotal(float taxFee, float cost, double discountRate){
        return (float) (((taxFee) * cost)
                + ((discountRate / 100) * cost) + cost);
    }

    public static long generateRandomId(){
       return (long) (Math.random() * (987654321 - 123456789) + 123456789);
    }

    public static int generateRandomPhoneNumber(){
      return  (int) (Math.random() * (999 - 111) + 111);
    }

    public static short generateRandomNumber(){
        return (short) (Math.random() * (25000 - 1) + 1);
    }

    public static String[] autoGeneratePatients(int maxNumberOfUsers){
        final float TAXES_FEES = 0.025f;

        String patientAccount = "";
        String[] data = new String[maxNumberOfUsers];
        for (int i = 0; i < maxNumberOfUsers; i++) {
            patientAccount = "";
            long patientIDNumber = generateRandomId();
            patientAccount += "[" + patientIDNumber + "]";

            patientAccount += "[" + getPatientFirstname() + "]";
            patientAccount += "[" + getPatientLastname() + "]";
            short patientStreetAddressNumber = generateRandomNumber();
            patientAccount += "[" + patientStreetAddressNumber + "]";
            patientAccount += "[" + getPatientStreetAddressName() + "]";
            patientAccount += "[" + getPatientCity() + "]";
            patientAccount += "[" + getPatientState() + "]";
            int patientZipCode = (int) (Math.random() * (25000 - 1) + 1);
            patientAccount += "[" + patientZipCode + "]";
            byte patientPainLevel = (byte) (Math.random() * (25000 - 1) + 1);
            // patientPainLevel = userInput.nextByte();
            patientAccount += "[" + patientPainLevel + "]";
         byte   patientPainLocation = (byte) (Math.random() * (25000 - 1) + 1);
            // patientPainLocation = userInput.nextByte();
            patientAccount += "[" + patientPainLocation + "]";
            byte patientPainType = (byte) (Math.random() * (25000 - 1) + 1);
            // patientPainType = userInput.nextByte();
            patientAccount += "[" + patientPainType + "]";
           byte points = (byte) (patientPainLevel + patientPainLocation
                    + patientPainType);
            patientAccount += "[" + points + "]";
            double patientDiscountRate = (Math.random() * (100 - 1) + 1);
            // patientDiscountRate = userInput.nextByte();
            patientAccount += "[" + patientDiscountRate + "]";
            float hi1 = 999999.99f;
            float lo1 = 1.00f;
            float patientCost = (float) (Math.random() * (hi1 - lo1) + lo1);
            // patientCost = userInput.nextFloat();
            patientAccount += "[" + patientCost + "]";

            float total = calculateTotal(TAXES_FEES,patientCost, patientDiscountRate);
            patientAccount += "[" + total + "]";
            //Patient Password
            String patientPassword = generatePatientPassword();

            patientAccount += "[" + patientPassword + "]";
           data[i] = "{" + patientIDNumber + ", " + patientAccount + "}\n";
        }
        return data;
    }
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // -------------Patients------------------------
        String patientFirstName = "";
        String patientLastName = "";
        String patientStreetAddressName = "";
        String patientCity = "";
        String patientState = "";
        String patientPhoneNumber = "";
        String patientPassword = "";
        String databasePatient = "";

        int patientCountNumber = 0;
        long patientIDNumber = 0;
        short patientStreetAddressNumber = 0;
        int patientZipCode = 0;
        byte patientPainLevel = 0;
        byte patientPainLocation = 0;
        byte patientPainType = 0;
        double patientDiscountRate = 0;
        float patientCost = 0.00f;
        String patientAccount = "";
        boolean isNextPatient = false;

        // --------------------------Doctor----------------
        String doctorAccount = "";

        String doctorFirstName = "";
        String doctorLastName = "";
        String doctorStreetAddressName = "";
        String doctorCity = "";
        String doctorState = "";

        int doctorCountNumber = 0;
        long doctorIDNumber = 0;
        short doctorStreetAddressNumber = 0;
        int doctorZipCode = 0;
        byte doctorExpertiseLevel = 0;
        String doctorOfficeHours = "";
        byte doctorYearsOfExperience = 0;
        double doctorDiscountRate = 0;
        float doctorCost = 0.00f;

        //--------------------------Administrator--------------
        String administratorAccount = "";
        String administratorFirstName = "";
        String administratorLastName = "";
        String administratorStreetAddressName = "";
        String administratorCity = "";
        String administratorState = "";

        int administratorCountNumber = 0;
        long administratorIDNumber = 0;
        short administratorStreetAddressNumber = 0;
        int administratorZipCode = 0;
        byte administratorPainLevel = 0;
        byte administratorPainLocation = 0;
        byte administratorPainType = 0;
        double administratorDiscountRate = 0;
        float administratorCost = 0.00f;
        //-----------------------------------------------------
        int points = 0;
        final float TAXES_FEES = 0.025f;
        float total = 0.00f;
        byte selectorMainMenu_s1 = 0;
        byte selectorSignUp_s2 = 0;
        byte selectorAddPatient = 0;

        boolean isPatient = false;
        boolean isDoctor = false;
        boolean isAdminstrator = false;

        // 4. Create 3 boolean variables with default there values = true , labeled :
        boolean runMainMenu = true;
        boolean runSignUp = true;
        boolean runLogIn = true;

        aboutNCH();
        while (runMainMenu) {
            selectorMainMenu_s1 = mainMenuSelection1(userInput);
            System.out.println("*User Entered(selectorMainMenu_s1) = " + selectorMainMenu_s1);

            //8 Add switch case statements
            switch (selectorMainMenu_s1) {
                case 1:
                    while (runSignUp) {

                        selectorSignUp_s2 = signupMenuSelection(userInput);
                        System.out.println("*User Entered(selectorSignUp_s2) = " + selectorSignUp_s2);


                        switch (selectorSignUp_s2) {
                            case 1:
                                selectorAddPatient = addPatientSelector(userInput);
                                System.out.println("*User Entered(selectorAddPatient) =" + selectorAddPatient);

                                System.out.println("Add Patient Menu _ 3. ");
                                if (selectorAddPatient == 1) {
                                    System.out.println("How many users do you want to create? ");
                                    int maxNumberOfUsers = userInput.nextInt();
                                    databasePatient = Arrays.toString(autoGeneratePatients(maxNumberOfUsers));
                                    saveToDatabase(databasePatient);

                                } else {
                                    do {
                                        System.out.println("-----------------New Patient------------");

                                        patientCountNumber++;
                                        System.out.println("1. <patientCountNumber++ > Patient's Count# = " + patientCountNumber);
                                        System.out.println("2. <User Input> must enter the Patient's ID# (ex. (123456789-" + "987654321) = 2022156");
                                        patientIDNumber = userInput.nextLong();

                                        //5.2.1 reassigning values
                                        System.out.println("3. <User Input> Patient's First Name : ");
                                        patientFirstName = userInput.next();

                                        //5.2.2 reassigning values
                                        System.out.println("4. <User Input> Patient's Last Name : ");
                                        patientLastName = userInput.next();

                                        System.out.println("5. <User Input> Patient's Street Address Number (ex. (1-25000) = 202):");

                                        patientStreetAddressNumber = userInput.nextByte();

                                        // 5.2.1 reassigning values
                                        System.out.println("6. <User Input> Patient's Street Address Name :");
                                        patientStreetAddressName = userInput.next();

                                        System.out.println("7. <User Input> Patient's City :");
                                        patientCity = userInput.next();

                                        System.out.println("8. <User Input> Patient's State :");
                                        patientState = userInput.next();

                                        System.out.println("9. <User Input> Patient's Zip Code (ex. (11111-99999) = 77002): ");
                                        patientZipCode = userInput.nextByte();

                                        System.out.println("10. <User Input> Patient's Pain Level (ex. (1-10) = 6)");
                                        patientPainLevel = userInput.nextByte();

                                        System.out.println("11. <User Input> Patient's Pain Location Number Select body location # below: \n 7. Head \n 6. Chest. Head \n 5. Stomach \n 4. Arms \n 3. Leg \n 2. Hand \n 1. Foot");
                                        patientPainLocation = userInput.nextByte();

                                        System.out.println("12.  <User Input> Patient's Pain Type :\n Select side of pain # below: \n 3 - External/Open Wound & Internal/Pain inside skin\n 2 - External/Open Wound\n1 - Internal/Pain inside skin");
                                        patientPainType = userInput.nextByte();

                                        points = patientPainLevel + patientPainLocation + patientPainType;
                                        System.out.println("13. <patientPainLevel + patientPainLocation + patientPainType>\n Patient's Total Points :" + points);

                                        System.out.println("14.<User Input> Patient's Discount Rate (ex. (1-100) = 25):");
                                        patientDiscountRate = userInput.nextByte();

                                        System.out.println("15. <TAXES_FEES> Patient's Taxes and Fees (TAXES_FEES): " + TAXES_FEES);
                                        System.out.println("16. <User Input> Patient's Cost (ex. (1.00-999999.99) = 1256.23): ");

                                        patientCost = userInput.nextFloat();

                                        total = calculateTotal(TAXES_FEES,patientCost, patientDiscountRate);


                                        // 7.4
                                        isPatient = true;

                                        System.out.println("17.<(((TAXES_FEES) * patientCost) + ((patientDiscountRate / 100) * patientCost) patientCost)> Patient's Total Total : " + total);

                                        // Collect patient information into patientAccount variable
                                        patientAccount += "[" + patientCountNumber + "]";
                                        patientAccount += "[" + patientIDNumber + "]";
                                        patientAccount += "[" + patientStreetAddressName + "]";
                                        patientAccount += "[" + patientCity + "]";
                                        patientAccount += "[" + patientState + "]";
                                        patientAccount += "[" + total + "]";

                                        // 8 Create phone number
                                        int area = generateRandomPhoneNumber();
                                        int pref = generateRandomPhoneNumber();
                                        int suff = generateRandomPhoneNumber();
                                        patientPhoneNumber = area + "-" + pref + "-" + suff;
                                        patientAccount += "[" + patientPhoneNumber + "]";

                                        // 7 Create password for patient.
                                        patientPassword = (char) (Math.random() * (90 - 65) + 65) + "" +
                                                (char) (Math.random() * (122 - 97) + 97) + "" +
                                                (char) (Math.random() * (122 - 97) + 97) + "" +
                                                (char) (Math.random() * (122 - 97) + 97) + "" +
                                                (char) (Math.random() * (122 - 97) + 97) + "" +
                                                (char) (Math.random() * (122 - 97) + 97) + "" +
                                                (char) (Math.random() * (36 - 33) + 33) + "" +
                                                (char) (Math.random() * (57 - 48) + 48) + "" +
                                                (char) (Math.random() * (57 - 48) + 48) + "";

                                        patientAccount += "[" + patientPassword + "]";

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
                                                "17. Patient with an ID of [" + patientIDNumber + "] owes [$" + total + "] for pain\n" +
                                                "point count total of [" + points + "] out of 20");

                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("======================\nPatient Data - Account\n-----------------\n" +
                                                patientAccount);

                                        System.out.println("");

                                        isNextPatient = shouldAddNextPatient(userInput);
                                    }
                                    while (isNextPatient);
                                    databasePatient += "{" + patientIDNumber + "," + patientAccount + "}\n";
                                }
                                break;
                            case 2:
                                //Implementation of doctor menu for bonus points
                                System.out.println("3. <User Input> Doctor's First Name : ");
                                doctorFirstName = userInput.next();

                                System.out.println("4. <User Input> Doctor's Last Name : ");
                                doctorLastName = userInput.next();

                                System.out.println("5. <User Input> Doctor's Street Address Number (ex. (1-25000) = 202):");

                                doctorStreetAddressNumber = userInput.nextByte();

                                System.out.println("6. <User Input> Doctor's Street Address Name :");
                                doctorStreetAddressName = userInput.next();

                                System.out.println("7. <User Input> Doctor's City :");
                                doctorCity = userInput.next();

                                System.out.println("8. <User Input> Doctor's State :");
                                doctorState = userInput.next();

                                System.out.println("9. <User Input> Doctor's Zip Code (ex. (11111-99999) = 77002): ");
                                doctorZipCode = userInput.nextByte();

                                System.out.println("10. <User Input> Doctor's Expertise Level (ex. (1-10) = 6)");
                                doctorExpertiseLevel = userInput.nextByte();

                                System.out.println("11. <User Input> Doctor's Office Hours : \n (ex. 9:00am - 5:00pm)");
                                doctorOfficeHours = userInput.next();

                                System.out.println("12.  <User Input> Doctor's Years of Experience :\n (ex. (0-99) = 5)");
                                doctorYearsOfExperience = userInput.nextByte();

                                points = doctorExpertiseLevel + doctorYearsOfExperience;
                                System.out.println("13. <doctorExpertiseLevel + doctorYearsOfExperience>\n Doctor's Total Points :" + points);

                                System.out.println("14.<User Input> Doctor's Discount Rate (ex. (1-100) = 25):");
                                doctorDiscountRate = userInput.nextByte();

                                System.out.println("15. <TAXES_FEES> Doctor's Taxes and Fees (TAXES_FEES): " + TAXES_FEES);
                                System.out.println("16. <User Input> Doctor's Cost (ex. (1.00-999999.99) = 1256.23): ");

                                doctorCost = userInput.nextFloat();

                                total = calculateTotal(TAXES_FEES,doctorCost, doctorDiscountRate);
                                isDoctor = true;

                                System.out.println("17.<(((TAXES_FEES) * doctorCost) + ((doctorDiscountRate / 100) * doctorCost) doctorCost)> Doctor's Total Total : " + total);

                                doctorAccount += "[" + doctorCountNumber + "]";
                                doctorAccount += "[" + doctorIDNumber + "]";
                                doctorAccount += "[" + doctorStreetAddressName + "]";
                                doctorAccount += "[" + doctorCity + "]";
                                doctorAccount += "[" + doctorState + "]";
                                doctorAccount += "[" + total + "]";

                                System.out.println("OutPut/Results of Program\n" +
                                        "--------------------------\n" +
                                        "//////// New Doctor - Sign Up : Receipt //////\n" +
                                        "1. Doctor's Count Number = " + doctorCountNumber + "\n" +
                                        "2. Doctor's ID Number = " + doctorIDNumber + "\n" +
                                        "3. Doctor's First Name = " + doctorFirstName + "\n" +
                                        "4. Doctor's Last Name = " + doctorLastName + "\n" +
                                        "5. Doctor's Street Address Number = " + doctorStreetAddressNumber + "\n" +
                                        "6. Doctor's Street Address Name = " + doctorStreetAddressName + "\n" +
                                        "7. Doctor's City = " + doctorCity + "\n" +
                                        "8. Doctor's State = " + doctorState + "\n" +
                                        "9. Doctor's Zip Code = " + doctorZipCode + "\n" +
                                        "10. Doctor's Expertise Level = " + doctorExpertiseLevel + "\n" +
                                        "11. Doctor's Years of Experience = " + doctorYearsOfExperience + "\n" +
                                        "12. Doctor's office Hours = " + doctorOfficeHours + "\n" +
                                        "13. Doctor's Discount Rate = " + doctorDiscountRate + "\n" +
                                        "14. Doctor's Taxes and Fees = " + TAXES_FEES + "\n" +
                                        "15. Doctor's Cost = " + doctorCost + "\n" +
                                        "16. Doctor with an ID of [" + doctorIDNumber + "] owes [$" + total + "] for\n" +
                                        "services rendered");

                                System.out.println("");
                                System.out.println("");
                                System.out.println("======================\nDoctor Data - Account\n-----------------\n" +
                                        doctorAccount);

                                break;
                            case 3:
                                //11.4
                                System.out.println("Add Administrator Menu _ 3. ");
                                administratorCountNumber++;
                                System.out.println("1. <administratorCountNumber++ > Administrator's Count# = " + administratorCountNumber);
                                System.out.println("2. <User Input> must enter the Administrator's ID# (ex. (123456789-" + "987654321) = 2022156");
                                administratorIDNumber = userInput.nextLong();

                                System.out.println("3. <User Input> Administrator's First Name : ");
                                administratorFirstName = userInput.next();

                                System.out.println("4. <User Input> Administrator's Last Name : ");
                                administratorLastName = userInput.next();

                                System.out.println("5. <User Input> Administrator's Street Address Number (ex. (1-25000) = 202):");

                                administratorStreetAddressNumber = userInput.nextByte();

                                System.out.println("6. <User Input> Administrator's Street Address Name :");
                                administratorStreetAddressName = userInput.next();

                                System.out.println("7. <User Input> Administrator's City :");
                                administratorCity = userInput.next();

                                System.out.println("8. <User Input> Administrator's State :");
                                administratorState = userInput.next();

                                System.out.println("9. <User Input> Administrator's Zip Code (ex. (11111-99999) = 77002): ");
                                administratorZipCode = userInput.nextByte();

                                System.out.println("10. <User Input> Administrator's Pain level (ex. (1-999999) = 50000):");
                                administratorPainLevel = userInput.nextByte();

                                System.out.println("11. <User Input> Patient's Pain Location Number Select body location # below: \n 7. Head \n 6. Chest. Head \n 5. Stomach \n 4. Arms \n 3. Leg \n 2. Hand \n 1. Foot");
                                administratorPainLocation = userInput.nextByte();

                                isAdminstrator = true;

                                administratorAccount += "[" + administratorCountNumber + "]";
                                administratorAccount += "[" + administratorIDNumber + "]";
                                administratorAccount += "[" + administratorStreetAddressName + "]";
                                administratorAccount += "[" + administratorCity + "]";
                                administratorAccount += "[" + administratorState + "]";
                                administratorAccount += "[" + administratorPainLevel + "]";
                                administratorAccount += "[" + administratorPainLocation + "]";

                                System.out.println("OutPut/Results of Program\n" +
                                        "--------------------------\n" +
                                        "//////// New Administrator - Sign Up : Receipt //////\n" +
                                        "1. Administrator's Count Number = " + administratorCountNumber + "\n" +
                                        "2. Administrator's ID Number = " + administratorIDNumber + "\n" +
                                        "3. Administrator's First Name = " + administratorFirstName + "\n" +
                                        "4. Administrator's Last Name = " + administratorLastName + "\n" +
                                        "5. Administrator's Street Address Number = " + administratorStreetAddressNumber + "\n" +
                                        "6. Administrator's Street Address Name = " + administratorStreetAddressName + "\n" +
                                        "7. Administrator's City = " + administratorCity + "\n" +
                                        "8. Administrator's State = " + administratorState + "\n" +
                                        "9. Administrator's Zip Code = " + administratorZipCode + "\n" +
                                        "10. Administrator's pain level = " + administratorPainLevel + "\n" +
                                        "11. Administrator's pain location = " + administratorPainLocation + "\n" +
                                        "12. Administrator's pain type = " + administratorPainType + "\n" +
                                        "13. Administrator's Discount Rate = " + administratorDiscountRate + "\n" +
                                        "14. Administrator's Taxes and Fees = " + TAXES_FEES + "\n" +
                                        "15. Administrator's Cost = " + administratorCost + "\n" +
                                        "16. Administrator with an ID of [" + administratorIDNumber + "] owes [$" + total + "] for\n" +
                                        "administrative services provided\n");

                                System.out.println("");
                                System.out.println("");
                                System.out.println("======================\nAdministrator Data - Account\n-----------------\n" +
                                        administratorAccount);

                                System.out.println("");
                                System.out.println("");

                                break;
                            case 4:
                                break;
                        }
                        runSignUp = getSignupReturnResponseFromUser(userInput) == 1 ? true : false;
                    }
                    break;
                case 2:

                        login(userInput);

                    break;
                case 3:
                    break;
            }


            System.out.println("===== Thank You For Choosing NCH =====");

            //11. Add flags to the program using boolean variables created in   instruction# 7.)

            if (isPatient) {
                System.out.println("Patient Created");

                //10. extracted outputId and totalCost from patient account using substring, indexOf, and lastIndexOf
                String cutString = patientAccount.substring(patientAccount.indexOf("]") + 1);

                String outputId = cutString.substring(cutString.indexOf("[") + 1, cutString.indexOf("]"));
                String totalCost = cutString.substring(cutString.lastIndexOf("[") + 1, cutString.lastIndexOf("]"));

                System.out.println("Patient ID# " + outputId);
                System.out.println("Total " + totalCost);
            }
            if (isDoctor) {
                System.out.println("Doctor Created");

                String cutString = doctorAccount.substring(doctorAccount.indexOf("]") + 1);

                String outputId = cutString.substring(cutString.indexOf("[") + 1, cutString.indexOf("]"));
                String totalCost = cutString.substring(cutString.lastIndexOf("[") + 1, cutString.lastIndexOf("]"));

                System.out.println("Doctor ID# " + outputId);
                System.out.println("Total " + totalCost);
            }
            if (isAdminstrator) {
                System.out.println("Administrator created");


                String cutString = administratorAccount.substring(administratorAccount.indexOf("]") + 1);

                String outputId = cutString.substring(cutString.indexOf("[") + 1, cutString.indexOf("]"));
                String totalCost = cutString.substring(cutString.lastIndexOf("[") + 1, cutString.lastIndexOf("]"));

                System.out.println("Administrator ID# " + outputId);
                System.out.println("Total " + totalCost);
            }
            System.out.println("");
            System.out.println("Would you like to :");
            System.out.println(" 1 - Return to Main Menu");
            System.out.println(" 2 - Exit Program");
            int ans = userInput.nextInt();
            runMainMenu = ans == 1 ? true : false;
        }

        // 9.3
        System.out.println(databasePatient);
        
        System.out.println("The End of Program.");
        userInput.close();
    }
}