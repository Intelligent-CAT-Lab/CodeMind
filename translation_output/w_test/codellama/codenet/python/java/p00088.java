<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
PETER POTTER

Expected output:
?D-C'KOPUA


```
#!/usr/bin/env python
# -*- coding: utf-8 -*-
from __future__ import (division, absolute_import, print_function,
                        unicode_literals)
from sys import stdin
import io

d1 = {
    ' ': '101', "'": '000000', ',': '000011', '-': '10010001',
    '.': '010001', '?': '000001', 'A': '100101', 'B': '10011010',
    'C': '0101', 'D': '0001', 'E': '110', 'F': '01001', 'G': '10011011',
    'H': '010000', 'I': '0111', 'J': '10011000', 'K': '0110', 'L': '00100',
    'M': '10011001', 'N': '10011110', 'O': '00101', 'P': '111',
    'Q': '10011111', 'R': '1000', 'S': '00110', 'T': '00111',
    'U': '10011100', 'V': '10011101', 'W': '000010', 'X': '10010010',
    'Y': '10010011', 'Z': '10010000'
    }
d2 = {n: chr(n+ord('A')) for n in range(26)}
d2.update(zip(range(26, 32), " .,-'?"))

for line in stdin:
    stream = io.StringIO()
    stream.write(''.join(d1[c] for c in line.rstrip('\r\n')))
    stream.seek(0)
    c = stream.read(5)
    while c:
        print(d2[int(c.ljust(5, '0'), 2)], end='')
        c = stream.read(5)
    print()
```
[/INST]

Here is the Java code that translates the Python code:
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PythonToJava {
    public static void main(String[] args) throws IOException {
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
        for (int i = 0; i < 26; i++) {
            d2.put(i, (char) (i + 'A'));
        }
        d2.put(26, ".");
        d2.put(27, ",");
        d2.put(28, "-");
        d2.put(29, "'");
        d2.put(30, "?");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            StringBuilder binary = new StringBuilder();
            for (char c : line.toCharArray()) {
                binary.append(d1.get(c));
            }
            int binaryLength = binary.length();
            int[] binaryArray = new int[binaryLength];
            for (int i = 0; i < binaryLength; i++) {
                binaryArray[i] = Integer.parseInt(binary.substring(i, i + 1));
            }
            int decimal = 0;
            for (int i = 0; i < binaryLength; i++) {
                decimal += binaryArray[i] * Math.pow(2, binaryLength - i - 1);
            }
            System.out.print(d2.get(decimal));
        }
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It defines two maps, `d1` and `d2`, which are used to convert the input string to binary and then to decimal. The `d1` map maps each character to its binary representation, and the `d2` map maps each decimal number to its corresponding character.

The code then reads the input string from the standard input, converts it to binary using the `d1` map, and then converts it to decimal using the `d2` map. Finally, it prints the resulting character to the standard output.

Note that this code assumes that the input string only contains characters that are present in the `d1` map. If the input string contains any other characters, the code will throw a `NullPointerException`.</s>
