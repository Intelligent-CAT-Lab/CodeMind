<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the Python code:

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

    static Map<String, Character> d2 = new HashMap<String, Character>() {{
        put("0111", 'I'); put("0110", 'K'); put("0101", 'C');
        put("01001", 'F'); put("010001", 'D'); put("00111", 'T');
        put("00110", 'S'); put("00101", 'O'); put("00100", 'L');
        put("0001", 'D'); put("000011", 'M'); put("000010", 'W');
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
        StringBuilder stream = new StringBuilder();
        for (char c : line.toCharArray()) {
            stream.append(d1.get(c));
        }
        String c = stream.toString();
        for (int i = 0; i < c.length(); i += 5) {
            System.out.print(d2.get(c.substring(i, Math.min(i + 5, c.length()))));
        }
        System.out.println();
    }
}
```

This Java code does the same thing as the Python code. It reads a line from the standard input, converts each character to its corresponding binary string using `d1`, and then converts each 5-character binary string to its corresponding character using `d2`. The result is printed to the standard output.
<|EOT|>
