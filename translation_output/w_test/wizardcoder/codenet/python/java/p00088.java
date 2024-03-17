Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
   '': '101', "'": '000000', ',': '000011', '-': '10010001',
    '.': '010001', '?': '000001', 'A': '100101', 'B': '10011010',
    'C': '0101', 'D': '0001', 'E': '110', 'F': '01001', 'G': '10011011',
    'H': '010000', 'I': '0111', 'J': '10011000', 'K': '0110', 'L': '00100',
    'M': '10011001', 'N': '10011110', 'O': '00101', 'P': '111',
    'Q': '10011111', 'R': '1000', 'S': '00110', 'T': '00111',
    'U': '10011100', 'V': '10011101', 'W': '000010', 'X': '10010010',
    'Y': '10010011', 'Z': '10010000'
    }
d2 = {n: chr(n+ord('A')) for n in range(26)}
d2.update(zip(range(26, 32), ".,-'?"))

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
```java
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine())!= null) {
            StringBuilder sb = new StringBuilder();
            for (char c : line.toCharArray()) {
                sb.append(d1.get(c) + " ");
            }
            String binary = sb.toString().trim();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < binary.length(); i += 5) {
                String code = binary.substring(i, Math.min(i + 5, binary.length()));
                result.append(d2.get(Integer.parseInt(code, 2)));
            }
            System.out.println(result.toString());
        }
    }

    private static final Map<Character, String> d1 = new HashMap<Character, String>() {{
        put(' ', "101");
        put("'", "000000");
        put(',', "000011");
        put('-', "10010001");
        put('.', "010001");
        put('?', "000001");
        put('A', "100101");
        put('B', "10011010");
        put('C', "0101");
        put('D', "0001");
        put('E', "110");
        put('F', "01001");
        put('G', "10011011");
        put('H', "010000");
        put('I', "0111");
        put('J', "10011000");
        put('K', "0110");
        put('L', "00100");
        put('M', "10011001");
        put('N', "10011110");
        put('O', "00101");
        put('P', "111");
        put('Q', "10011111");
        put('R', "1000");
        put('S', "00110");
        put('T', "00111");
        put('U', "10011100");
        put('V', "10011101");
        put('W', "000010");
        put('X', "10010010");
        put('Y', "10010011");
        put('Z', "10010000");
    }};

    private static final Map<Integer, Character> d2 = new HashMap<Integer, Character>() {{
        put(0, 'A');
        put(1, 'B');
        put(2, 'C');
        put(3, 'D');
        put(4, 'E');
        put(5, 'F');
        put(6, 'G');
        put(7, 'H');
        put(8, 'I');
        put(9, 'J');
        put(10, 'K');
        put(11, 'L');
        put(12, 'M');
        put(13, 'N');
        put(14, 'O');
        put(15, 'P');
        put(16, 'Q');
        put(17, 'R');
        put(18, 'S');
        put(19, 'T');
        put(20, 'U');
        put(21, 'V');
        put(22, 'W');
        put(23, 'X');
        put(24, 'Y');
        put(25, 'Z');
        put(26,'');
        put(27, ',');
        put(28, '-');
        put(29, '.');
        put(30, '?');
        put(31, '\'');
    }};
}
```<|endoftext|>
