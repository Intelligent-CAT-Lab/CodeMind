import java.io.*;
import java.util.*;

public class p00088 {
    private static Map<Character, String> d1 = new HashMap<Character, String>() {{
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

    private static Map<String, Character> d2 = new HashMap<String, Character>() {{
        put("0111", 'I'); put("0110", 'K'); put("0101", 'C');
        put("01001", 'F'); put("010001", 'T'); put("00111", '7');
        put("00110", '6'); put("00101", 'E'); put("00100", 'L');
        put("0001", 'D'); put("000011", '9'); put("000010", '2');
        put("000001", '?'); put("000000", '\''); put("111", 'P');
        put("110", 'E'); put("101", ' '); put("10011111", 'Q');
        put("10011110", 'N'); put("10011101", 'V'); put("10011100", 'U');
        put("10011011", 'G'); put("10011010", 'B'); put("10011001", 'M');
        put("10011000", 'J'); put("100101", 'A'); put("10010011", 'Y');
        put("10010010", 'X'); put("10010001", '-'); put("10010000", 'Z');
        put("1000", 'R');
    }};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (char c : line.toCharArray()) {
            sb.append(d