import java.util.Scanner;

public class p03740 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(Math.abs(x-y)<=1){
            System.out.println("erow/");
        }else{
            System.out.println("Alice");
        }
    }
}