import java.util.*;

public class p03672 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int n = s.length();
        int[] lll = new int[n-2];
        for(int i=1; i<n-1; i+=2) {
            lll[i/2] = i;
        }
        for(int i=0; i<lll.length; i++) {
            int j = lll[i];
            if(s.substring(0, j/2).equals(s.substring(j/2, j))) {
                System.out.println(j);
                return;
            }
        }
        System.out.println("-1");
    }
}