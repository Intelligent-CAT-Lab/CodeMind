<s> Translate the following python code to java and enclose your solution inside ```java```:
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

### 解答

```java
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        OutputStream out = System.out;
        InputStreamReader isr = new InputStreamReader(in);
        PrintStream ps = new PrintStream(out);

        Map<Character, String> d1 = new HashMap<>();
        d1.put(' ', "101");
        d1.put("'", "000000");
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

        Map<Character, Character> d2 = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            d2.put(i, (char) (i + 'A'));
        }
        d2.put(' ', '101');
        d2.put("'", "000000");
        d2.put(',', "000011");
        d2.put('-', "10010001");
        d2.put('.', "010001");
        d2.put('?', "000001");
        d2.put('A', "100101");
        d2.put('B', "10011010");
        d2.put('C', "0101");
        d2.put('D', "0001");
        d2.put('E', "110");
        d2.put('F', "01001");
        d2.put('G', "10011011");
        d2.put('H', "010000");
        d2.put('I', "0111");
        d2.put('J', "10011000");
        d2.put('K', "0110");
        d2.put('L', "00100");
        d2.put('M', "10011001");
        d2.put('N', "10011110");
        d2.put('O', "00101");
        d2.put('P', "111");
        d2.put('Q', "10011111");
        d2.put('R', "1000");
        d2.put('S', "00110");
        d2.put('T', "00111");
        d2.put('U', "10011100");
        d2.put('V', "10011101");
        d2.put('W', "000010");
        d2.put('X', "10010010");
        d2.put('Y', "10010011");
        d2.put('Z', "10010000");

        for (String line; (line = isr.readLine()) != null;) {
            String[] chars = line.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (char c : chars) {
                sb.append(d1.get(c));
            }
            String c = sb.toString();
            int[] arr = new int[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(c.substring(i, i + 5), 2);
            }
            Arrays.
