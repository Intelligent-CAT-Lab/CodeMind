import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        double c=1.0*a/b;
        System.out.println(a/b+" "+a%b+" "+String.format("%.5f",c));
    }
}
