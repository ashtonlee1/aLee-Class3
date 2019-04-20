import java.util.Scanner;
public class User{
    private String password;
    public String userid;
    public String registerDate;
    public void setPassword(String x){
        password=x;
    }
    public void setUserid(String n){
        userid=n;
    }
    public boolean Login(){
        Scanner login = new Scanner(System.in);
        System.out.println("Username: ")
        String a = login.nextLine();
        System.out.println("Password: ");
        String b = login.nextLine();
        if(a.equals(userid) && b.equals(password) return true;
        else return false;
    }
}
