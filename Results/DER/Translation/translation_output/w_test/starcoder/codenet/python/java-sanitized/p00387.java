import java.util.*;
public class p00387 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int kimawasi=B/A;
        if(B%A>0)
            kimawasi=kimawasi+1;
        System.out.println(kimawasi);
    }
}