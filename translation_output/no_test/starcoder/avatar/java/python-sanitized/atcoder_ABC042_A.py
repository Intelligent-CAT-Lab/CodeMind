import java.util.*;

class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int num_1 = Integer.parseInt(str);

        str = scan.next();
        int num_2 = Integer.parseInt(str);

        str = scan.next();
        int num_3 = Integer.parseInt(str);

        if (num_1 == 7):
            if (num_2 == 5 and num_3 == 5):
                System.out.println("YES");
            else:
                System.out.println("NO");
        elif (num_2 == 7):
            if (num_1 == 5 and num_3 == 5):
                System.out.println("YES");
            else:
                System.out.println("NO");
        elif (num_3 == 7):
            if (num_2 == 5 and num_1 == 5):
                System.out.println("YES");
            else:
                System.out.println("NO");
    }
}