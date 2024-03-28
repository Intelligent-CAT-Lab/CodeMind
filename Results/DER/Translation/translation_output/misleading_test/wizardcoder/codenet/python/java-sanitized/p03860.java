import java.util.Scanner;

public class p03860 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        String output = "A" + arr[0].charAt(0) + "C";
        System.out.println(output);
    }
}