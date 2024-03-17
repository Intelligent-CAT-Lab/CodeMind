import java.util.*;
public class p03149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for(int i=0;i<4;i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        int[] b = {1,4,7,9};
        if(Arrays.equals(a,b)) System.out.println("YES");
        else System.out.println("NO");
    }
}