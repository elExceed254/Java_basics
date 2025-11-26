import java.util.Scanner;

public class sales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bill To Information
        System.out.println("Enter Bill To Information:");
        System.out.print("Company Name: ");
        String billCompany = scanner.nextLine();
        System.out.print("Address Line 1: ");
        String billAddress1 = scanner.nextLine();
        System.out.print("Address Line 2: ");
        String billAddress2 = scanner.nextLine();
        System.out.print("GSTIN: ");
        String billGSTIN = scanner.nextLine();
        System.out.print("Contact: ");
        String billContact = scanner.nextLine();
        System.out.print("Email: ");
        String billEmail = scanner.nextLine();

        // Ship To Information
        System.out.println("\nEnter Ship To Information:");
        System.out.print("Company Name: ");
        String shipCompany = scanner.nextLine();
        System.out.print("Address Line 1: ");
        String shipAddress1 = scanner.nextLine();
        System.out.print("Address Line 2: ");
        String shipAddress2 = scanner.nextLine();
        System.out.print("GSTIN: ");
        String shipGSTIN = scanner.nextLine();
        System.out.print("Contact: ");
        String shipContact = scanner.nextLine();
        System.out.print("Email: ");
        String shipEmail = scanner.nextLine();


        // Variables to store product data
        int sNo1, sNo2, sNo3, sNo4, sNo5, sNo6, sNo7;
        String productCode1, productCode2, productCode3, productCode4, productCode5, productCode6, productCode7;
        String productName1, productName2, productName3, productName4, productName5, productName6, productName7;
        String hsnCode1, hsnCode2, hsnCode3, hsnCode4, hsnCode5, hsnCode6, hsnCode7;
        int quantity1, quantity2, quantity3, quantity4, quantity5, quantity6, quantity7;
        String units1, units2, units3, units4, units5, units6, units7;
        double rate1, rate2, rate3, rate4, rate5, rate6, rate7;
        double tax1, tax2, tax3, tax4, tax5, tax6, tax7;
        double amount1, amount2, amount3, amount4, amount5, amount6, amount7;

        // Input Product 1
        sNo1 = 1;
        System.out.println("\nProduct 1");
        System.out.print("Product Code: ");
        productCode1 = scanner.nextLine();
        System.out.print("Product Name: ");
        productName1 = scanner.nextLine();
        System.out.print("HSN Code: ");
        hsnCode1 = scanner.nextLine();
        System.out.print("Quantity: ");
        quantity1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Units: ");
        units1 = scanner.nextLine();
        System.out.print("Rate: ");
        rate1 = scanner.nextDouble();
        System.out.print("Tax (%): ");
        tax1 = scanner.nextDouble();
        scanner.nextLine();
        amount1 = quantity1 * rate1;
        amount1 += amount1 * tax1/100;

        // Input Product 2
        sNo2 = 2;
        System.out.println("\nProduct 2");
        System.out.print("Product Code: ");
        productCode2 = scanner.nextLine();
        System.out.print("Product Name: ");
        productName2 = scanner.nextLine();
        System.out.print("HSN Code: ");
        hsnCode2 = scanner.nextLine();
        System.out.print("Quantity: ");
        quantity2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Units: ");
        units2 = scanner.nextLine();
        System.out.print("Rate: ");
        rate2 = scanner.nextDouble();
        System.out.print("Tax (%): ");
        tax2 = scanner.nextDouble();
        scanner.nextLine();
        amount2 = quantity2 * rate2;
        amount2 += amount2 * tax2/100;

        // Input Product 3
        sNo3 = 3;
        System.out.println("\nProduct 3");
        System.out.print("Product Code: ");
        productCode3 = scanner.nextLine();
        System.out.print("Product Name: ");
        productName3 = scanner.nextLine();
        System.out.print("HSN Code: ");
        hsnCode3 = scanner.nextLine();
        System.out.print("Quantity: ");
        quantity3 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Units: ");
        units3 = scanner.nextLine();
        System.out.print("Rate: ");
        rate3 = scanner.nextDouble();
        System.out.print("Tax (%): ");
        tax3 = scanner.nextDouble();
        scanner.nextLine();
        amount3 = quantity3 * rate3;
        amount3 += amount3 * tax3/100;

        // Input Product 4
        sNo4 = 4;
        System.out.println("\nProduct 4");
        System.out.print("Product Code: ");
        productCode4 = scanner.nextLine();
        System.out.print("Product Name: ");
        productName4 = scanner.nextLine();
        System.out.print("HSN Code: ");
        hsnCode4 = scanner.nextLine();
        System.out.print("Quantity: ");
        quantity4 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Units: ");
        units4 = scanner.nextLine();
        System.out.print("Rate: ");
        rate4 = scanner.nextDouble();
        System.out.print("Tax (%): ");
        tax4 = scanner.nextDouble();
        scanner.nextLine();
        amount4 = quantity4 * rate4;
        amount4 += amount4 * tax4/100;

        // Input Product 5
        sNo5 = 5;
        System.out.println("\nProduct 5");
        System.out.print("Product Code: ");
        productCode5 = scanner.nextLine();
        System.out.print("Product Name: ");
        productName5 = scanner.nextLine();
        System.out.print("HSN Code: ");
        hsnCode5 = scanner.nextLine();
        System.out.print("Quantity: ");
        quantity5 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Units: ");
        units5 = scanner.nextLine();
        System.out.print("Rate: ");
        rate5 = scanner.nextDouble();
        System.out.print("Tax (%): ");
        tax5 = scanner.nextDouble();
        scanner.nextLine();
        amount5 = quantity5 * rate5;
        amount5 += amount5 * tax5/100;

        // Input Product 6
        sNo6 = 6;
        System.out.println("\nProduct 6");
        System.out.print("Product Code: ");
        productCode6 = scanner.nextLine();
        System.out.print("Product Name: ");
        productName6 = scanner.nextLine();
        System.out.print("HSN Code: ");
        hsnCode6 = scanner.nextLine();
        System.out.print("Quantity: ");
        quantity6 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Units: ");
        units6 = scanner.nextLine();
        System.out.print("Rate: ");
        rate6 = scanner.nextDouble();
        System.out.print("Tax (%): ");
        tax6 = scanner.nextDouble();
        scanner.nextLine();
        amount6 = quantity6 * rate6;
        amount6 += amount6 * tax6/100;

        // Input Product 7
        sNo7 = 7;
        System.out.println("\nProduct 7");
        System.out.print("Product Code: ");
        productCode7 = scanner.nextLine();
        System.out.print("Product Name: ");
        productName7 = scanner.nextLine();
        System.out.print("HSN Code: ");
        hsnCode7 = scanner.nextLine();

        System.out.print("Quantity: ");
        quantity7 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Units: ");
        units7 = scanner.nextLine();
        System.out.print("Rate: ");
        rate7 = scanner.nextDouble();
        System.out.print("Tax (%): ");
        tax7 = scanner.nextDouble();
        scanner.nextLine();
        amount7 = quantity7 * rate7;
        amount7 += amount7 * tax7/100;


        double total = amount1 + amount2 + amount3 + amount4 + amount5 + amount6 + amount7;
        double discountPercentage = 0.6368;
        double discountAmount = total * discountPercentage / 100;
        double grandTotal = total - discountAmount;

        System.out.println("\n\n========================================================================================================");
        System.out.println("\t\t\t\t\tSALES INVOICE");
        System.out.println("========================================================================================================");
        System.out.println();
        System.out.println("Bill To:\t\t\t\t\t\t\t\t\tShip To:");
        System.out.println(billCompany + "\t\t\t\t\t\t\t\t" + shipCompany);
        System.out.println(billAddress1 + "\t\t\t\t\t\t" + shipAddress1);
        System.out.println(billAddress2 + "\t\t\t\t\t\t\t\t" + shipAddress2);
        System.out.println("GSTIN:" + billGSTIN + "\t\t\t\t\t\t\tGSTIN:" + shipGSTIN);
        System.out.println("Contact: " + billContact + "\t\t\t\t\t\tContact: " + shipContact);
        System.out.println("Email: " + billEmail + "\t\tEmail: " + shipEmail);
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("\t\tPayment Date: 7 days form date of delivery\t\t\t\tPayment Terms: 100% against invoice");
        System.out.println();
        System.out.println("========================================================================================================");
        System.out.println("S.No\tProduct Code\tProduct Name\t\t\tHSN code\tQuantity\tUnits\tRate\t Tax\t Amount");
        System.out.println("========================================================================================================");
        System.out.println(sNo1 + "\t|\t" + productCode1 + "\t\t\t|\t" + productName1 + "\t\t\t\t |\t" + hsnCode1 + "\t|\t" + quantity1
                + "\t\t|\t" + units1 + "\t |\t" + rate1 + "\t|" + tax1 + "%\t|" + amount1);
        System.out.println(sNo2 + "\t|\t" + productCode2 + "\t\t\t|\t" + productName2 + "\t\t |\t" + hsnCode2 + "\t|\t" + quantity2
                + "\t\t|\t" + units2 + "\t |\t" + rate2 + "\t|" + tax2 + "%\t|" + amount2);
        System.out.println(sNo3 + "\t|\t" + productCode3 + "\t\t\t|\t" + productName3 + " |\t" + hsnCode3 + "\t|\t" + quantity3
                + "\t\t|\t" + units3 + "\t |\t" + rate3 + "\t|" + tax3 + "%\t|" + amount3);
        System.out.println(sNo4 + "\t|\t" + productCode4 + "\t\t\t|\t" + productName4 + "\t\t\t |\t" + hsnCode4 + "\t|\t" + quantity4
                + "\t\t|\t" + units4 + "\t |\t" + rate4 + "\t|" + tax4 + "%\t|" + amount4);
        System.out.println(sNo5 + "\t|\t" + productCode5 + "\t\t\t|\t" + productName5 + " |\t" + hsnCode5 + "\t|\t" + quantity5
                + "\t\t|\t" + units5 + "\t |\t" + rate5 + "\t|" + tax5 + "%\t|" + amount5);
        System.out.println(sNo6 + "\t|\t" + productCode6 + "\t\t\t|\t" + productName6 + "\t\t\t |\t" + hsnCode6 + "\t|\t" + quantity6
                + "\t\t|\t" + units6 + "\t |\t" + rate6 + "\t|" + tax6 + "%\t|" + amount6);
        System.out.println(sNo7 + "\t|\t" + productCode7 + "\t\t\t|\t" + productName7 + "|\t" + hsnCode7 + "\t|\t" + quantity7
                + "\t\t|\t" + units7 + "\t |\t" + rate7 + "\t|" + tax7 + "%\t|" + amount7);
        System.out.println("========================================================================================================");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTotal\t\t|" + total);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDiscounts\t|" + discountAmount);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tGrand total\t|" + grandTotal);
        System.out.println();
        System.out.println("========================================================================================================");


        scanner.close();
    }
}