import java.util.Scanner;

public class p01641 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] memory = new int[30];
        for (int i = 0; i < 30; i++) {
            memory[i] = i * 10;
        }
        String output = "";
        int point = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int n = (int) c / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                output += ">" + ">" * d;
            } else {
                output += "<" + "<" * d;
            }
            point = n;
            int l = Math.abs(memory[point] - c);
            if (memory[point] < c) {
                output += "+" + "+" * l;
            } else {
                output += "-" + "-" * l;
            }
            memory[point] = c;
            output += ".";
        }
        System.out.println(output);
    }
}