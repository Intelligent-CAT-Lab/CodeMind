import java.util.*;
public class p02149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] S = new int[3];
        for(int i=0;i<3;i++) S[i] = sc.nextInt();
        if(S.indexOf(Math.max(S)) == 0) System.out.println("A");
        else if(S.indexOf(Math.max(S)) == 1) System.out.println("B");
        else if(S.indexOf(Math.max(S)) == 2) System.out.println("C");
    }
}