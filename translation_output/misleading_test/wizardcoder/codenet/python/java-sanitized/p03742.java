import java.util.Scanner;

public class p03742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(Math.abs(a-b)>1){
            System.out.println(":rO,u");
        }else{
            System.out.println("Brown");
        }
    }
}