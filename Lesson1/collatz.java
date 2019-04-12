public class collatz {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        System.out.println(k);
        while(k != 1) {
            k=getCollatz(k);
            System.out.println(k);
        }
    }
    public static void printIntArray(int[] z) {
        for(int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
    }
    public static int getCollatz(int a) {
        if(a%2==0) {
            a/=2;
        }
        else {
            a=3*a+1;
        }
        return a;
    }
}
