import java.util.Scanner;

public class p03860 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        String output = arr[0].substring(0, 1) + arr[1].substring(0, 1) + arr[2].substring(0, 1);
        System.out.println(output);
    }
}