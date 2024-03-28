import java.util.Scanner;

public class p02817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String firstWord = words[0];
        String secondWord = words[1];
        System.out.println(secondWord + firstWord);
    }
}



$ java Solution
oder atc
atcoder