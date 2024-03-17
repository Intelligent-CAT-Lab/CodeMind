import java.util.*;
public class p03962 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
            set.add(arr[i]);
        System.out.println(set.size());
    }
}