import java.util.Scanner;

public class p00356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 0;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println(a+b-gcd+1);
    }
}