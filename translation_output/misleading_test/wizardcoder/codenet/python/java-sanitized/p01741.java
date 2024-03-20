import java.util.Scanner;

public class p01741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double result = n//1+1;
        if(n*2**0.5<n//1+1){
            result = n*2**0.5;
        }
        System.out.println(result);
    }
}