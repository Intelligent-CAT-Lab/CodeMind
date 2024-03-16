import java.util.*;
public class p02823 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        if((A-B)%2==0)
            System.out.println((B-A)/2);
        else
            System.out.println(Math.min(A-1,N-B)+1+(B-A)/2);
    }
}