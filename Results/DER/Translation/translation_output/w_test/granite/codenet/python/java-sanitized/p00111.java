import java.util.Scanner;

public class p00111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tableA = {"00000", "00001", "00010", "00011", "00100", "00101", "00110", "00111", "01000", "01001", "01010", "01011", "01100", "01101", "01110", "01111", "10000", "10001", "10010", "10011", "10100", "10101", "10110", "10111", "11000", "11001", "11010", "11011", "11100", "11101", "11110", "11111"};
        String[] tableB = {"101", "000000", "000011", "10010001", "010001", "000001", "100101", "10011010", "0101", "0001", "110", "01001", "10011011", "010000", "0111", "10011110", "10011111", "1000", "00110", "00111", "10011100", "10011101", "000010", "10010010", "10010011"};
        String output = "";
        String tmp = "";
        for (int i = 0; i < input.length(); i++) {
            tmp += input.charAt(i);
            if (tmp.length() == 5) {
                for (int j = 0; j < tableA.length; j++) {
                    if (tmp.equals(tableA[j])) {
                        output += tableB[j];
                        tmp = "";
                        break;
                    }
                }
            }
        }
        System.out.println(output);
    }
}