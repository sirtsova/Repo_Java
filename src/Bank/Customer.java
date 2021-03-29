package Bank;

public class Customer {
    // field variable
    String name;
    String address;
    String phone;
    String ssn;
    // variable to customer balance
    double balance = 0.00;
    static int customerCount = 0;
    static String bankName = "ABC";

    /**
     * Method to return customer name
     */
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void getProfile() {
        System.out.println("Name : " + name +
                "\nAddress : " + address +
                "\nPhone : " + phone +
                "\nLast 4 digits-Ssn : " + ssn +
                "\nAccount balance : " + balance);
    }

    /**
     * Method to create customer profile
     */
    public void createCustomerProfile(String cName, String cAddr, String cPhone, String cSsn) {
        name = cName;
        address = cAddr;
        phone = cPhone;
        ssn = cSsn;
    }

    public void updateAddress(String newAddress) {
        address = newAddress;
    }

    /**
     * Method to make deposit
     * name: makeDeposit
     * input: 1 (double)
     * return type: double
     *
     */
    public double makeDeposit(double depositAmt) {
        if (depositAmt > 0) {
            balance = balance + depositAmt;
        } else {
            System.out.println("Invalid deposit amount entered -> " + depositAmt);
        }
        return balance;
    }

    /**
     * Method to make withdraw
     * name: makeWithdraw
     * input: 1 (double)
     * return type: double
     *
     */
    public double makeWithdraw(double withdrawAmt) {
        if (withdrawAmt <= balance && withdrawAmt > 0) {
            balance = balance - withdrawAmt;
        } else {
            System.out.println("Invalid withdraw amount entered -> " + withdrawAmt);
        }
        return balance;
    }

    /**
     * TO access the method:
     * 1. using class object (method as normal method)
     * 2. using class name (method as static method)
     */

    public double getBalance() {
        return balance;
    }

    public static double getBalance2() {
        return 0.0;
    }


}