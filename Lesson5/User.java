import java.util.Scanner;
public class User{
    private String password;
    public String userid;
    public String registerDate;
    public void setUserid(String u){
        userid=u;
    }
    public void setPassword(String p){
        password=p;
    }
    public boolean login(){
        Scanner m=new Scanner(System.in);
        System.out.println("Userid");
        String a=m.nextLine();
        System.out.println("Password");
        String b=m.nextLine();
        if(a.equals(userid)&&b.equals(password)) return true;
        else return false;
    }
}
