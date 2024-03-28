Below is the Python code translated to Java. I encapsulated the provided code into a class method that takes a string as its input and returns the encoded string. For ease of understanding and close resemblance to the Python code, I am also using a `HashMap` to mimic the Python dictionary for mapping characters.

```java
import java.util.HashMap;

public class VariableWidthEncoding {

    private static HashMap<Character, String> d1 = new HashMap<>();
    private static HashMap<Integer, Character> d2 = new HashMap<>();

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
        
        for (int n = 0; n < 26; n++) {
            d2.put(n, (char) (n + 'A'));
        }
        d2.put(26, ' ');
        d2.put(27, '.');
        d2.put(28, ',');
        d2.put(29, '-');
        d2.put(30, '\'');
        d2.put(31, '?');
    }

    public static String encode(String input) {
        StringBuilder binaryString = new StringBuilder();
        for (char c : input.toCharArray()) {
            binaryString.append(d1.get(c));
        }
        
        StringBuilder encodedString = new StringBuilder();
        int index = 0;
        while (index < binaryString.length()) {
            String fiveBits = binaryString.substring(index, Math.min(index + 5, binaryString.length()));
            fiveBits = String.format("%-5s", fiveBits).replace(' ', '0');  // Right pad with zeroes if less than 5 bits
            int charCode = Integer.parseInt(fiveBits, 2);
            encodedString.append(d2.get(charCode));
            index += 5;
        }
        return encodedString.toString();
    }

    public static void main(String[] args) {
        String input = "PETER POTTER";
        String encoded = encode(input);
        System.out.println(encoded);
    }
}
```

If you run this code and provide it with the test input "PETER POTTER", you should expect the output "?D-C'KOPUA".
