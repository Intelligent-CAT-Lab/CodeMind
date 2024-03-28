import java.util.Scanner;

public class p03427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n.length();i++){
            sum+=n.charAt(i)-'0';
        }
        System.out.println(Math.max(sum-9,sum-1));
    }
}