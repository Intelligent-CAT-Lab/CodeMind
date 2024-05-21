import java.util.Scanner;

public class p00088 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] morseCode = input.split(" ");
        String[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ.,-'?".split("");
        String[] binary = {"101", "'000000", ",000011", "-10010001", ".010001", "?000001", "A100101", "B10011010", "C0101", "D0001", "E110", "F01001", "G10011011", "H010000", "I0111", "J10011000", "K0110", "L00100", "M10011001", "N10011110", "O00101", "P111", "Q10011111", "R1000", "S00110", "T00111", "U10011100", "V10011101", "W000010", "X10010010", "Y10010011", "Z10010000"};
        String[] decoded = new String[morseCode.length];
        for (int i = 0; i < morseCode.length; i++) {
            for (int j = 0; j < binary.length; j++) {
                if (morseCode[i].equals(binary[j])) {
                    decoded[i] = alphabet[j];
                }
            }
        }
        for (String s : decoded) {
            System.out.print(s);
        }
    }
}