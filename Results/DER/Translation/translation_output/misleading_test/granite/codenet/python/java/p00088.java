System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
PETER POTTER

Expected output:
?[-C'fOPUA

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


Answer:
```java
import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] morseCode = input.split(" ");
        String[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ.,-'?".split("");
        String[] binary = {"101", "'000000", ",000011", "-10010001", ".010001", "?000001", "A100101", "B10011010", "C0101", "D0001", "E110", "F01001", "G10011011", "H010000", "I0111", "J10011000", "K0110", "L00100", "M10011001", "N10011110", "O00101", "P111", "Q10011111", "R1000", "S00110", "T00111", "U10011100", "V10011101", "W000010", "X10010010", "Y10010011", "Z10010000"};
        String[] decoded = new String[morseCode.length];
        for (int i = 0; i < morseCode.length; i++) {
            for (int j = 0; j < binary.length; j++) {
                if (morseCode[i].equals(binary[j])) {
                    decoded[i] = alphabet[j];
                }
            }
        }
        for (String s : decoded) {
            System.out.print(s);
        }
    }
}
```<|endoftext|>
