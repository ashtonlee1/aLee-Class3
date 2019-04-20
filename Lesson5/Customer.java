import java.util.Scanner;
public class Customer extends User{
	String name;
	String address;
	String email;
	String customerId;
	double accountBalance=0;
  public void register(){
		Scanner f = new Scanner(System.in);
		System.out.println("Set Userid");
		String a = f.nextLine();
		System.out.println("Set Password");
		String b = f.nextLine();
    System.out.println("Enter Address");
    address = f.nextLine();
    System.out.println("Enter Email");
    email = f.nextLine();
		setUserid(a);
		setPassword(b);
	}
}
class OrderDetails extends Customer{
	String orderId;
	String productId;
	String productName;
	int quantity;
	double unitCost;
	double total;
	public void setQuantity(int a){
		quantity = a;
	}
	public void setCost(double b){
		unitCost = b;
	}
	public void calculateTotal() {
		total = quantity * unitCost;
	}
}
class Order extends OrderDetails{
  public void purchase(){
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the price of the item");
		setCost(n.nextDouble());
		System.out.println("Enter the quanitity of the item");
		setQuantity(n.nextInt());
		calculateTotal();
		double price = total;
		if(accountBalance<price){
			System.out.println("You do not have enough money to buy this item.");
		}
    else{
      accountBalance=accountBalance-price;
    }
	}
}
