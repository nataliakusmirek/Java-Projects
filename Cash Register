
/**
 * CashRegister Class!
 *
 */
import java.util.*;
public class CashRegister
{
        private int twenty;
        private int ten;
        private int five;
        private int one;
        private int quarters;
        private int dimes;
        private int nickels;
        private int pennies;
        private double amount;
        private double userAmount;
        private double total;
        private double totalINPUT;
        private double purchase = 1;
        
    public CashRegister(int twenty, int ten, int five, int one, int quarters, int dimes, int nickels, int pennies){
        this.twenty = twenty;
        this.ten = ten;
        this.five = five;
        this.one = one;
        this.quarters = quarters;
        this.dimes = dimes;
        this.nickels = nickels;
        this.pennies = pennies;
    }
        
    public void addCash(int twenty, int ten, int five, int one, int quarters, int dimes, int nickels, int pennies)
    {
        this.twenty += twenty;
        this.ten += ten;
        this.five += five;
        this.one += one;
        this.quarters += quarters;
        this.dimes += dimes;
        this.nickels += nickels;
        this.pennies += pennies;
    }
    
    public void removeCash(int twenty, int ten, int five, int one, int quarters, int dimes, int nickels, int pennies)
    {
        this.twenty -= twenty;
        this.ten -= ten;
        this.five -= five;
        this.one -= one;
        this.quarters -= quarters;
        this.dimes -= dimes;
        this.nickels -= nickels;
        this.pennies -= pennies;   
    }
    
    public void total()
    {
        double quartersCalculate = this.quarters;
        quartersCalculate = 0.25 * quartersCalculate;
        
        double dimesCalculate = this.dimes;
        dimesCalculate = 0.10 * dimesCalculate;
        
        double nickelsCalculate = this.nickels;
        nickelsCalculate = 0.05 * nickelsCalculate;
        
        double penniesCalculate = this.pennies;
        penniesCalculate = 0.01 * penniesCalculate;
        
        double twentyCalculate = this.twenty;
        twentyCalculate = 20.00 * twentyCalculate;
        
        double tenCalculate = this.ten;
        tenCalculate = 10.00 * tenCalculate;
        
        double fiveCalculate = this.five;
        fiveCalculate = 5 * fiveCalculate;
        

        total = twentyCalculate + tenCalculate + fiveCalculate + this.one + quartersCalculate + dimesCalculate + nickelsCalculate + penniesCalculate;
        System.out.println(total + " dollars currently in the register");
    }
    
    public void multiplePurchases()
    {
        Scanner input = new Scanner(System.in);
        double totalPurchases = 0;
        while (purchase != 0)
        {
            System.out.println("Enter the price for the purchase, enter 0 when you have inputted every purchase price: ");
            purchase = input.nextDouble();
            totalPurchases += purchase;
        }
        System.out.println("The total amount you must pay: " + totalPurchases);
        this.totalINPUT = totalPurchases;
        validPaymentINPUTDONE(totalINPUT);
    }
    
    /* checks if the amount of money inputted to pay is enough, then subtracts that amount from the register and returns your change. */
    public void validPayment()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price for your purchase: ");
        double purchase = input.nextDouble();
        System.out.println("Enter the amount you will pay for your purchase: ");
        double payment = input.nextDouble();
        while (payment < purchase)
        {
            System.out.println("Enter the amount you will pay for your purchase, it must be enough to cover the cost!: ");
            payment = input.nextDouble();
        }
        /* optimum that puts in register and one optimum out money from the register, one optimum calls addcash, one optimum calls removecash is needed */
        double result = payment - purchase;
        this.userAmount = payment;
        optimumAmountADD(userAmount);
        
        this.amount = result;
        System.out.println("Here is your change.");
        optimumAmountSUBTRACT(amount);
        System.out.println("Thank you!");
        }
        
    public void validPaymentINPUTDONE(double totalINPUT)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the amount you will pay for your purchase: ");
        double payment = input.nextDouble();
        while (payment < totalINPUT)
        {
            System.out.println("Enter the amount you will pay for your purchase, it must be enough to cover the cost!: ");
            payment = input.nextDouble();
        }
        /* optimum that puts in register and one optimum out money from the register, one optimum calls addcash, one optimum calls removecash is needed */
        double result = payment - totalINPUT;
        this.userAmount = payment;
        optimumAmountADD(userAmount);
        
        this.amount = result;
        System.out.println("Here is your change.");
        optimumAmountSUBTRACT(amount);
        System.out.println("Thank you!");
        }
    
    
    public void optimumAmountADD(double userAmount)
    {
        int twentyCount = 0;
        int tenCount = 0;
        int fiveCount = 0;
        int oneCount = 0;
        int quartersCount = 0;
        int dimesCount = 0;
        int nickelsCount = 0;
        int penniesCount = 0;
        
        while (amount > 0)
        {
            if (amount >= 20)
        {
            amount -= 20;
            twentyCount++;
        }
        else if (amount >= 10 && amount < 20)
        {
            amount -= 10;
            tenCount++;
        }
        else if (amount >= 5 && amount < 10)
        {
            amount -= 5;
            fiveCount++;
        }
        else if (amount >= 1 && amount < 5)
        {
            amount -= 1;
            oneCount++;
        }
        else if (amount >= 0.25 && amount < 1)
        {
            amount -= 0.25;
            quartersCount++;
        }
        else if (amount >= 0.10 && amount < 0.25)
        {
            amount -= 0.10;
            dimesCount++;
        }
        else if (amount >= 0.05 && amount < 0.10)
        {
            amount -= 0.05;
            nickelsCount++;
        }
        else if (amount >= 0.01 && amount < 0.05)
        {
            amount -= 0.01;
            penniesCount++;
        }
        }
        this.twenty = twentyCount;
        this.ten = tenCount;
        this.five = fiveCount;
        this.one = oneCount;
        this.quarters = quartersCount;
        this.dimes = dimesCount;
        this.nickels = nickelsCount;
        this.pennies = penniesCount;
        
        addCash(twenty, ten, five, one, quarters, dimes, nickels, pennies);
    }
    
    public void optimumAmountSUBTRACT(double amount)
    {
        int twentyCount = 0;
        int tenCount = 0;
        int fiveCount = 0;
        int oneCount = 0;
        int quartersCount = 0;
        int dimesCount = 0;
        int nickelsCount = 0;
        int penniesCount = 0;
        
        while (amount > 0)
        {
            if (amount >= 20)
        {
            amount -= 20;
            twentyCount++;
        }
        else if (amount >= 10 && amount < 20)
        {
            amount -= 10;
            tenCount++;
        }
        else if (amount >= 5 && amount < 10)
        {
            amount -= 5;
            fiveCount++;
        }
        else if (amount >= 1 && amount < 5)
        {
            amount -= 1;
            oneCount++;
        }
        else if (amount >= 0.25 && amount < 1)
        {
            amount -= 0.25;
            quartersCount++;
        }
        else if (amount >= 0.10 && amount < 0.25)
        {
            amount -= 0.10;
            dimesCount++;
        }
        else if (amount >= 0.05 && amount < 0.10)
        {
            amount -= 0.05;
            nickelsCount++;
        }
        else if (amount >= 0.01 && amount < 0.05)
        {
            amount -= 0.01;
            penniesCount++;
        }
        }
        System.out.println(twentyCount + " twenty dollar bills");
        System.out.println(tenCount + " ten dollar bills");
        System.out.println(fiveCount + " five dollar bills");
        System.out.println(oneCount + " one dollar bills");
        System.out.println(quartersCount + " quarters");
        System.out.println(dimesCount + " dimes");
        System.out.println(nickelsCount + " nickels");
        System.out.println(penniesCount + " pennies");
        
        this.twenty = twentyCount;
        this.ten = tenCount;
        this.five = fiveCount;
        this.one = oneCount;
        this.quarters = quartersCount;
        this.dimes = dimesCount;
        this.nickels = nickelsCount;
        this.pennies = penniesCount;
        
        removeCash(twenty, ten, five, one, quarters, dimes, nickels, pennies);
    }
}



Test class below: three tests done, each was successful. Advanced test showing the most realistic use of a customer buying multiple items and then paying is after the test code.




/**
 * ALL TESTS SUCCESSFUL! THIS IS THE TEST CLASS FOR CASHREGISTER.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testCashRegister
{
    public static void main()
    {
        /* test one: create a cashregister object 
         * that then has multiple purchases called to it, 
         * then check the total amount left in the register 
         * after to see if the sum of the purchases was 
         * correctly subtracted.*/
         
        CashRegister c1 = new CashRegister(5,5,5,5,5,5,5,5);
        c1.total();
        c1.multiplePurchases();
        c1.total();
        
        /* test two: create a cashregister object 
         * that then has money added, then
         * the total is checked, then money is subtracted, then the total checked again*/
           
        CashRegister c2 = new CashRegister(10,10,10,10,10,10,10,10);
        c2.total();
        c2.addCash(5,6,7,8,9,8,7,6);
        c2.total();
        c2.removeCash(3,3,3,3,3,3,3,3);
        c2.total();
        
        /* test three: tests the optimumAmount methods (add and subtract) with inputted values*/
        
        CashRegister c3 = new CashRegister(5,5,5,5,5,5,5,5);
        c3.total();
        c3.optimumAmountADD(150);
        c3.total();
        c3.optimumAmountSUBTRACT(55);
        c3.total();

        
        /* ADVANCED: Testing simulates as close as possible the situation of a customer 
         *buying multiple items, paying for them, and receiving change.  
         *The register object is updated accordingly at each step. */
         
        CashRegister advancedTest = new CashRegister(5,5,5,5,5,5,5,5);
        advancedTest.multiplePurchases();

        
        
        
        
        
        
        
    }

}


