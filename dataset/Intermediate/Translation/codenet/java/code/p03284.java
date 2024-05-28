import java.util.*;

public class p03284{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        if(n%k == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}