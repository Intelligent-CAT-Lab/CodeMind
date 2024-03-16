import java.io.*;
import java.util.*;

public class p00088 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for (char c : line.toCharArray()) {
                sb.append(switch (c) {
                    case'' -> "101";
                    case '\'' -> "000000";
                    case ',' -> "000011";
                    case '-' -> "10010001";
                    case '.' -> "010001";
                    case '?' -> "000001";
                    case 'A' -> "100101";
                    case 'B' -> "10011010";
                    case 'C' -> "0101";
                    case 'D' -> "0001";
                    case 'E' -> "110";
                    case 'F' -> "01001";
                    case 'G' -> "10011011";
                    case 'H' -> "010000";
                    case 'I' -> "0111";
                    case 'J' -> "10011000";
                    case 'K' -> "0110";
                    case 'L' -> "00100";
                    case 'M' -> "10011001";
                    case 'N' -> "10011110";
                    case 'O' -> "00101";
                    case 'P' -> "111";
                    case 'Q' -> "10011111";
                    case 'R' -> "1000";
                    case 'S' -> "00110";
                    case 'T' -> "00111";
                    case 'U' -> "10011100";
                    case 'V' -> "10011101";
                    case 'W' -> "000010";
                    case 'X' -> "10010010";
                    case 'Y' -> "10010011";
                    case 'Z' -> "10010000";
                    default -> "";
                });
            }
            String s = sb.toString();
            while (s.length() > 0) {
                System.out.print(switch (s.substring(0, 5)) {
                    case "10100" -> " ";
                    case "000000" -> "'";
                    case "000011" -> ",";
                    case "10010001" -> "-";
                    case "010001" -> ".";
                    case "000001" -> "?";
                    case "100101" -> "A";
                    case "10011010" -> "B";
                    case "0101" -> "C";
                    case "0001" -> "D";
                    case "110" -> "E";
                    case "01001" -> "F";
                    case "10011011" -> "G";
                    case "010000" -> "H";
                    case "0111" -> "I";
                    case "10011000" -> "J";
                    case "0110" -> "K";
                    case "00100" -> "L";
                    case "10011001" -> "M";
                    case "10011110" -> "N";
                    case "00101" -> "O";
                    case "111" -> "P";
                    case "10011111" -> "Q";
                    case "1000" -> "R";
                    case "00110" -> "S";
                    case "00111" -> "T";
                    case "10011100" -> "U";
                    case "10011101" -> "V";
                    case "000010" -> "W";
                    case "10010010" -> "X";
                    case "10010011" -> "Y";
                    case "10010000" -> "Z";
                    default -> "";
                });
                s = s.substring(5);
            }
            System.out.println();
        }
    }
}