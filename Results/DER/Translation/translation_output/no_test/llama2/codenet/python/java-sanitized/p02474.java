Solution


import java.util.Scanner;

public class p02474 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int a1 = Integer.parseInt(a[0]);
        int a2 = Integer.parseInt(a[1]);
        System.out.println(a1*a2);
    }
}