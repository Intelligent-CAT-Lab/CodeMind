import java.util.Scanner;

public class p00332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int Y = sc.nextInt();
        if (E == 0) {
            if (1912 > Y) {
                System.out.println("M" + (Y - 1867));
            } else if (1926 > Y) {
                System.out.println("T" + (Y - 1911));
            } else if (1989 > Y) {
                System.out.println("S" + (Y - 1925));
            } else {
                System.out.println("H" + (Y - 1988));
            }
        } else if (E == 1) {
            System.out.println(1867 + Y);
        } else if (E == 2) {
            System.out.println(1911 + Y);
        } else if (E == 3) {
            System.out.println(1925 + Y);
        } else {
            System.out.println(1988 + Y);
        }
    }
}

/docs/python/python-100-examples/python-exercise-example10.md
# Python 练习实例10