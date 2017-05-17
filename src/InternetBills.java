import java.util.Scanner;

/**
 * Created by maboonga on 16.05.17.
 */
public class InternetBills {

    public static void main(final String[] args) {
        final double PACKAGE_A_BASE_PRICE = 9.95;
        final double PACKAGE_B_BASE_PRICE = 13.95;
        final double PACKAGE_C_BASE_PRICE = 19.95;
        final int PACKAGE_A_HOURS = 10;
        final int PACKAGE_B_HOURS = 20;
        final double PACKAGE_A_EXTRA_FEE = 2.00;
        final double PACKAGE_B_EXTRA_FEE = 1.00;

        Scanner sc = new Scanner(System.in);
        String userInputPackage;
        int userInputHours;
        System.out.println("What package do you use?");
        userInputPackage = sc.nextLine();
        System.out.println("How many hours did you use?");
        userInputHours = sc.nextInt();

        if (userInputPackage.equalsIgnoreCase("a")) {

        }


    }


}

/*
    An Internet service provider has three different subscription packages for its customers:

        Package A: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour.

        Package B: For $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour.

        Package C: For $19.95 per month unlimited access is provided.

        Write a program that calculates a customer’s monthly bill.
        It should ask the user to enter the letter of the package the customer has purchased (A, B, or C)
        and the number of hours that were used. It should then display the total charges.

        Gaddis, Tony (2015-05-29). Starting Out with Java: From Control Structures through Objects (Page 188). Pearson Education.
        Kindle Edition.
*/