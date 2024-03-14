import java.io.*;
import java.util.*;

public class p00088 {
    static Map<Character, String> d1 = new HashMap<Character, String>() {{
        put(' ', "101"); put('\'', "000000"); put(',', "000011");
        put('-', "10010001"); put('.', "010001"); put('?', "000001");
        put('A', "100101"); put('B', "10011010"); put('C', "0101");
        put('D', "0001"); put('E', "110"); put('F', "01001");
        put('G', "10011011"); put('H', "010000"); put('I', "0111");
        put('J', "10011000"); put('K', "0110"); put('L', "00100");
        put('M', "10011001"); put('N', "10011110"); put('O', "00101");
        put('P', "111"); put('Q', "10011111"); put('R', "1000");
        put('S', "00110"); put('T', "00111"); put('U', "10011100");
        put('V', "10011101"); put('W', "000010"); put('X', "10010010");
        put('Y', "10010011"); put('Z', "10010000");
    }};

    static Map<Integer, Character> d2 = new HashMap<Integer, Character>() {{
        put(0, ' '); put(1, '.'); put(2, ','); put(3, '-');
        put(4, '\''); put(5, '?'); put(6, 'A'); put(7, 'B');
        put(8, 'C'); put(9, 'D'); put(10, 'E'); put(11, 'F');
        put(12, 'G'); put(13, 'H'); put(14, 'I'); put(15, 'J');
        put(16, 'K'); put(17, 'L'); put(18, 'M'); put(19, 'N');
        put(20, 'O'); put(21, 'P'); put(22, 'Q'); put(23, 'R');
        put(24, 'S'); put(25, 'T'); put(26, 'U'); put(27, 'V');
        put(28, 'W'); put(29, 'X'); put(30, 'Y'); put(31, 'Z');
    }};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            StringBuilder sb = new StringBuilder();
            for (char c : line.toCharArray()) {
                sb.append(d