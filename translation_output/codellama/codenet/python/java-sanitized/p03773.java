import java.util.Scanner;

public class p03773 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a + b) % 24);
    }
}


We then create a new Scanner object called sc, which is used to read input from the user.

Next, we use the sc.nextInt() method to read two integers from the user, which are stored in the variables a and b.