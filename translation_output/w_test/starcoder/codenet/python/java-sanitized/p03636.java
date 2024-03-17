import java.util.*;
public class p03636 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr = s.split("");
        System.out.println(arr[0]+arr.length-1+arr[arr.length-1]);
    }
}