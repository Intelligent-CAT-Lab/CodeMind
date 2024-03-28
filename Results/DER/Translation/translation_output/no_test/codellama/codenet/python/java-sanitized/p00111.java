import java.util.Scanner;

public class p00111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'A') {
                output += "00000";
            } else if (c == 'B') {
                output += "00001";
            } else if (c == 'C') {
                output += "00010";
            } else if (c == 'D') {
                output += "00011";
            } else if (c == 'E') {
                output += "00100";
            } else if (c == 'F') {
                output += "00101";
            } else if (c == 'G') {
                output += "00110";
            } else if (c == 'H') {
                output += "00111";
            } else if (c == 'I') {
                output += "01000";
            } else if (c == 'J') {
                output += "01001";
            } else if (c == 'K') {
                output += "01010";
            } else if (c == 'L') {
                output += "01011";
            } else if (c == 'M') {
                output += "01100";
            } else if (c == 'N') {
                output += "01101";
            } else if (c == 'O') {
                output += "01110";
            } else if (c == 'P') {
                output += "01111";
            } else if (c == 'Q') {
                output += "10000";
            } else if (c == 'R') {
                output += "10001";
            } else if (c == 'S') {
                output += "10010";
            } else if (c == 'T') {
                output += "10011";
            } else if (c == 'U') {
                output += "10100";
            } else if (c == 'V') {
                output += "10101";
            } else if (c == 'W') {
                output += "10110";
            } else if (c == 'X') {
                output += "10111";
            } else if (c == 'Y') {
                output += "11000";
            } else if (c == 'Z') {
                output += "11001";
            } else if (c == ' ') {
                output += "11010";
            } else if (c == '.') {
                output += "11011";
            } else if (c == ',') {
                output += "11100";
            } else if (c == '-') {
                output += "11101";
            } else if (c == '\'') {
                output += "11110";
            } else if (c == '?') {
                output += "11111";
            }
        }
        System.out.println(output);
    }
}