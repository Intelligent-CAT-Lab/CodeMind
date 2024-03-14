<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
Here is the Java equivalent of the provided Python code:

```java
import java.io.*;
import java.util.*;

public class Main {
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
                sb.append(d1.get(c));
            }
            String binary = sb.toString();
            for (int i = 0; i < binary.length(); i += 5) {
                String chunk = binary.substring(i, Math.min(i + 5, binary.length()));
                int decimal = Integer.parseInt(chunk, 2);
                System.out.print(d2.get(decimal));
            }
            System.out.println();
        }
    }
}
```

This Java code does the same thing as the Python code. It reads lines from standard input, converts each character to a binary string using `d1`, concatenates these strings, and then converts each 5-character binary string back to a character using `d2`. The result is printed to standard output.
<|EOT|>
