import java.util.*;
public class p03042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = Integer.parseInt(s.substring(0,2));
        int b = Integer.parseInt(s.substring(2,4));
        if(b == 0 || b > 12){
            if(1 <= a <= 12){
                System.out.println("MMYY");
            }else{
                System.out.println("NA");
            }
        }else if(1 <= a <= 12){
            System.out.println("AMBIGUOUS");
        }else{
            System.out.println("YYMM");
        }
    }
}