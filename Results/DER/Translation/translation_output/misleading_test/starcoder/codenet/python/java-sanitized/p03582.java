import java.util.*;
public class p03582 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] L = new int[a+b+c];
        for(int i=0;i<a;i++) L[i] = 0;
        for(int i=0;i<b;i++) L[i+a] = 1;
        for(int i=0;i<c;i++) L[i+a+b] = 2;
        while(L.length > 1) {
            int[] temp = new int[L.length-1];
            for(int i=0;i<temp.length;i++) temp[i] = L[i] + L[i+1];
            Arrays.sort(temp);
            L = temp;
        }
        System.out.println("".join(new String[] {"a","b","c"}[L[0]]));
    }
}