```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MorseCodeConverter {

    private static final Map<Character, String> d1 = new HashMap<>();
    private static final Map<String, Character> d2 = new HashMap<>();

    static {
        d1.put(' ', "101");
        d1.put('\'', "000000");
        d1.put(',', "000011");
        d1.put('-', "10010001");
        d1.put('.', "010001");
        d1.put('?', "000001");
        d1.put('A', "100101");
        d1.put('B', "10011010");
        d1.put('C', "0101");
        d1.put('D', "0001");
        d1.put('E', "110");
        d1.put('F', "01001");
        d1.put('G', "10011011");
        d1.put('H', "010000");
        d1.put('I', "0111");
        d1.put('J', "10011000");
        d1.put('K', "0110");
        d1.put('L', "00100");
        d1.put('M', "10011001");
        d1.put('N', "10011110");
        d1.put('O', "00101");
        d1.put('P', "111");
        d1.put('Q', "10011111");
        d1.put('R', "1000");
        d1.put('S', "00110");
        d1.put('T', "00111");
        d1.put('U', "10011100");
        d1.put('V', "10011101");
        d1.put('W', "000010");
        d1.put('X', "10010010");
        d1.put('Y', "10010011");
        d1.put('Z', "10010000");

        for (int i = 0; i < 26; i++) {
            d2.put(String.valueOf(i), (char) (i + 'A'));
        }
        d2.put("26", ' ');
        d2.put("27", '.');
        d2.put("28", ',');
        d2.put("29", '-');
        d2.put("30", '\'');
        d2.put("31", '?');
    }

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                convertMorseCode(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void convertMorseCode(String line) {
        StringBuilder result = new StringBuilder();

        StringBuilder morseStream = new StringBuilder();
        for (char c : line.toCharArray()) {
            morseStream.append(d1.getOrDefault(c, ""));
        }

        for (int i = 0; i < morseStream.length(); i += 5) {
            String chunk = morseStream.substring(i, Math.min(i + 5, morseStream.length()));
            while (chunk.length() < 5) {
                chunk += "0";
            }
            char character = d2.getOrDefault(chunk, ' ');
            result.append(character);
        }

        System.out.println(result.toString());
    }
}
```
