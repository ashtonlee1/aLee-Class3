import java.util.Scanner;
public class Customer extends User{
	String name;
	String address;
	String email;
	String customerId;
	private double accountBalance=0;
  public void register(){
		Scanner f = new Scanner(System.in);
		System.out.println("Set Username");
		String a = f.nextLine();
		System.out.println("Set Password");
		String b = f.nextLine();
    System.out.println("Enter Address");
    address = f.nextLine();
    System.out.println("Enter Email");
    email = f.nextLine();
	}
}
public class Order extends Customer{
  public void purchase(){
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the price of the item");
		double price = n.nextDouble();
		if(accountBalance<price){
			System.out.println("You do not have enough money to buy this item.");
		}
    else{
      accountBalance=accountBalance-price;
    }
	}
}
