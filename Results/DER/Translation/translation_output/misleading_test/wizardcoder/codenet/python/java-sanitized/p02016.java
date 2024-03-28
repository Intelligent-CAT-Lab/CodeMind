import java.util.Scanner;

public class p02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = "square1001";
        if(input.equals("ani")) {
            output = "squareo1001";
        }
        System.out.println(output);
    }
}