package Bank;

public class Bank {
    public static void main(String[] args) {

        /**
         * Syntax to create object of any class
         *
         * ClassName refVariable = new ClassName();
         *
         */
        Customer custOne = new Customer();
        /*
            Generally, custOne is object of Customer class

            Technically,
            custOne is variable (or reference variable) of Customer class, and
                storing the object of Customer class

         */

        Customer abcd;    // abcd is a variable of Customer datatype
        String s1 = "happy";

        custOne.createCustomerProfile("Happy", "NY", "1234567890", "1111");

        String newAddr = "MI";

        custOne.updateAddress(newAddr);

        System.out.println("Update got updated successfully? --> " + custOne.getAddress().equalsIgnoreCase(newAddr));
        // Verify a customer can change address

        /**
         * Class/object
         * Why removed static?
         * doubts
         */

        System.out.println("My balance: " + custOne.getBalance());  // 0

        custOne.makeDeposit(100);

        System.out.println("balance after deposit -> " + custOne.makeDeposit(100));

        System.out.println("balance after deposit -> " + custOne.makeDeposit(-10));

        System.out.println("balance after withdraw -> " + custOne.makeWithdraw(-700));

        System.out.println("balance after withdraw -> " + custOne.makeWithdraw(700));

        System.out.println("balance after withdraw -> " + custOne.makeWithdraw(60));

        System.out.println("My balance: " + custOne.getBalance());  // 40


        Customer.getBalance2();

    }
}
