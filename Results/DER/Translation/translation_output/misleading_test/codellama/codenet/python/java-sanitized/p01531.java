import java.util.Scanner;

public class p01531 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '2') {
                output += "k";
            } else if (c == '3') {
                output += "s";
            } else if (c == '4') {
                output += "t";
            } else if (c == '5') {
                output += "n";
            } else if (c == '6') {
                output += "h";
            } else if (c == '7') {
                output += "m";
            } else if (c == '8') {
                output += "y";
            } else if (c == '9') {
                output += "r";
            } else if (c == '0') {
                i++;
                char nextChar = input.charAt(i);
                if (nextChar == 'T') {
                    output += "wa";
                } else if (nextChar == 'D') {
                    output += "wo";
                } else if (nextChar == 'U') {
                    output += "nn";
                }
            } else if (c == 'T') {
                output += "a";
            } else if (c == 'L') {
                output += "i";
            } else if (c == 'U') {
                output += "u";
            } else if (c == 'R') {
                output += "e";
            } else if (c == 'D') {
                output += "o";
            }
        }

        System.out.println(output);
    }
}