import java.util.Scanner;

public class Main {

  public static void main(String[] args)
  {
    System.out.println("1 Rupee");
    System.out.println("2 Dollar");
    System.out.println("3 Euro");

    Scanner sc = new Scanner(System.in);
    System.out.println("Choose your currency (1,2,3) ");
    int choice = sc.nextInt();
    System.out.println("Enter the amount: ");
    double amount = sc.nextDouble();

    switch (choice) {
      case 1:
        Rupee(amount);
        break;
      case 2:
        Dollar(amount);
        break;
      case 3:
        Euro(amount);
        break;
      default:
        System.out.println("Wrong choice, correct input required.");
    }
    
  }

  public static void Rupee(double amount){
    System.out.println("1 Rupee = " + 0.013 + " Dollar");
    System.out.println();

    System.out.println(amount + " Rupee = " + (amount*0.013) + " Dollar");
    System.out.println();

    System.out.println("1 Rupee = " + 0.012 + " Euro");
    System.out.println();

    System.out.println(amount + " Rupee = " + (amount*0.012) + " Euro");
    System.out.println();
  }

  public static void Dollar(double amount)
  {
    System.out.println("1 Dollar = " + 79.37 + " Rupee");
    System.out.println();

    System.out.println(amount + " Dollar = " + (amount* 79.37) + " Rupee");
    System.out.println();

    System.out.println("1 Dollar = " + 0.98 + " Euro");
    System.out.println();

    System.out.println(amount + " Dollar = " + (amount*0.98) + " Euro");
    System.out.println();
  }

  public static void Euro(double amount)
  {
    System.out.println("1 Euro = " + 80.85 + " Rupee");
    System.out.println();

    System.out.println(amount + " Euro = " + (amount* 80.85) + " Rupee");
    System.out.println();

    System.out.println("1 Euro = " + 1.02 + " Dollar");
    System.out.println();

    System.out.println(amount + " Euro = " + (amount*1.02) + " Dollar");
    System.out.println();
  } 
}
