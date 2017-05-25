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
        int exceededHours =0;
        int exceededHoursB =0;
        double extraCharge =0;
        double extraChargeB =0;
        double totalBill = 0;
        double totalBillB = 0;
        double savingsIfChoseB = 0;
        double savingsIfChoseC = 0;
        double savingIfChangedBForC = 0;

        System.out.println("What package do you use?");
        userInputPackage = sc.nextLine();
        System.out.println("How many hours did you use?");
        userInputHours = sc.nextInt();

        if (userInputPackage.equalsIgnoreCase("a")) {
            if (userInputHours>PACKAGE_A_HOURS){
                exceededHours = userInputHours - PACKAGE_A_HOURS;
                extraCharge = exceededHours*PACKAGE_A_EXTRA_FEE;
            }
            totalBill = PACKAGE_A_BASE_PRICE + extraCharge;

            if (userInputHours > PACKAGE_B_HOURS) {
                exceededHoursB = userInputHours - PACKAGE_B_HOURS;
                extraChargeB = exceededHoursB * PACKAGE_B_EXTRA_FEE;
            }
            totalBillB = PACKAGE_B_BASE_PRICE + extraChargeB;

            if (totalBill>totalBillB){
                savingsIfChoseB = totalBill - totalBillB;
                System.out.printf("You would save $%.2f if you've chosen package B\n", savingsIfChoseB);
            }

            if (totalBill>PACKAGE_C_BASE_PRICE) {
                savingsIfChoseC = totalBill - PACKAGE_C_BASE_PRICE;
                System.out.printf("You would save $%.2f if you've chosen package C\n", savingsIfChoseC);
            }

        } else if (userInputPackage.equalsIgnoreCase("b")) {
            if (userInputHours > PACKAGE_B_HOURS) {
                exceededHours = userInputHours - PACKAGE_B_HOURS;
                extraCharge = exceededHours * PACKAGE_B_EXTRA_FEE;
            }
            totalBill = PACKAGE_B_BASE_PRICE + extraCharge;

            if (totalBill>PACKAGE_C_BASE_PRICE) {
                savingIfChangedBForC = totalBill - PACKAGE_C_BASE_PRICE;
                System.out.printf("You would save $%.2f if you've chosen package C\n", savingIfChangedBForC);

            }

        } else if (userInputPackage.equalsIgnoreCase("c")) {
            totalBill = PACKAGE_C_BASE_PRICE;
        }
        System.out.printf("Your choosen package is: %s\n Hours exceeded: %d\n " +
                        "Extra fee: $%.2f\n Total bill: $%.2f",
                userInputPackage, exceededHours, extraCharge, totalBill );
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

        Part 2

    Modify the program so it also calculates and displays the amount of money Package A customers would save
    if they purchased Package B or C, and the amount of money Package B customers would save if they purchased
    Package C. If there would be no savings, no message should be printed.

    Gaddis, Tony (2015-05-29). Starting Out with Java: From Control Structures through Objects (Page 188). Pearson Education.
    Kindle Edition.
*/