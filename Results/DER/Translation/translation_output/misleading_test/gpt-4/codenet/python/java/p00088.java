Below is the Java translation of your provided Python code, enclosed as requested:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HuffmanDecoder {
    public static void main(String[] args) {
        Map<Character, String> d1 = new HashMap<>();
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

        Map<Integer, Character> d2 = new HashMap<>();
        for (int n = 0; n < 26; n++) {
            d2.put(n, (char) (n + 'A'));
        }
        d2.put(26, ' ');
        d2.put(27, '.');
        d2.put(28, ',');
        d2.put(29, '-');
        d2.put(30, '\'');
        d2.put(31, '?');

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder encoded = new StringBuilder();
        for (char c : line.toCharArray()) {
            encoded.append(d1.get(c));
        }

        String encodedString = encoded.toString();
        for (int i = 0; i < encodedString.length(); i += 5) {
            String code = encodedString.substring(i, Math.min(i + 5, encodedString.length()));
            code = String.format("%-5s", code).replace(' ', '0');  // Pad with zeros if necessary
            int value = Integer.parseInt(code, 2);
            System.out.print(d2.get(value));
        }
        scanner.close();
    }
}
```

This Java program takes the input from the standard input via `Scanner`, encodes the string using Huffman codes as per the provided mapping, and then decodes it to print the expected output. It assumes that input will be provided through standard input, similar to the Python code reading from `stdin`. Please note that a `Scanner` object is closed when it is no longer needed to release the underlying resources associated with it.
