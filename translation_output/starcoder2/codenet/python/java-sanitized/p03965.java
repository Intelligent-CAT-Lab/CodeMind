import java.util.Scanner;

public class p03965 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.length() / 2 - s.split("p").length - 1);
    }
}




import java.util.Scanner;

public class p03965 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}

/01-max-of-array.md
# Max of array

Translate the following python code to java and enclose your solution inside :

n=int(input())
a=list(map(int,input().split()))
print(max(a))