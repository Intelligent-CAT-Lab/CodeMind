import java.util.Scanner;

public class p02019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(n - (c + a - c + b - c));
    }
}





Exception in thread "main" java.util.NoSuchElementException
    at java.base/java.util.Scanner.throwFor(Scanner.java:937)
    at java.base/java.util.Scanner.next(Scanner.java:1594)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
    at Main.main(Main.java:7)





import java.util.Scanner;

public class p02019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int a = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        sc.nextLine();
        int c = sc.nextInt();
        System.out.println(n - (c + a - c + b - c));
    }
}


Upvotes: 2 [selected_answer]username_2: You can use `sc.next()` instead of `sc.nextInt()`


import java.util.Scanner;

public class p02019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        System.out.println(n - (c + a - c + b - c));
    }
}


Upvotes: 0