import java.util.Scanner;

public class p00111 {
    public static void main(String[] args) {
        String[] tableA = {"00000", "00001", "00010", "00011", "00100", "00101", "00110", "00111", "01000", "01001", "01010", "01011", "01100", "01101", "01110", "01111", "10000", "10001", "10010", "10011", "10100", "10101", "10110", "10111", "11000", "11001", "11010", "11011", "11100", "11101", "11110", "11111"};
        String[] tableB = {" ", "'", ",", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String tmp = "";
            String ans = "";
            for (char c : s.toCharArray()) {
                tmp += c;
                if (tmp.length() == 5) {
                    int index = Integer.parseInt(tmp, 2);
                    ans += tableB[index];
                    tmp = "";
                }
            }
            System.out.println(ans);
        }
    }
}