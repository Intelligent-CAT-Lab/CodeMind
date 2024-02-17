import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int cntT = c / b;
        if(c % b != 0) cntT++;
        int cntA = a / d;
        if(a % d != 0) cntA++;
        System.out.println( cntT <= cntA ? "Yes" : "No");
    }
}