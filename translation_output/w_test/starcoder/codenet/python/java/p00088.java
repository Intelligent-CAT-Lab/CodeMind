<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
    }
}
```
"""

import io
import re
import sys

# Complete the caesarCipher function below.
def caesarCipher(s):
    s = s.upper()
    s = re.sub(r'[^A-Z]', '', s)
    s = s.replace(' ', '')
    s = s.replace('?', '1')
    s = s.replace(',', '2')
    s = s.replace('-', '3')
    s = s.replace('.', '4')
    s = s.replace('\'', '5')
    s = s.replace('!', '6')
    s = s.replace(':', '7')
    s = s.replace(';', '8')
    s = s.replace('(', '9')
    s = s.replace(')', '0')
    s = s.replace('A', '101')
    s = s.replace('B', '10011010')
    s = s.replace('C', '0101')
    s = s.replace('D', '0001')
    s = s.replace('E', '110')
    s = s.replace('F', '01001')
    s = s.replace('G', '10011011')
    s = s.replace('H', '010000')
    s = s.replace('I', '0111')
    s = s.replace('J', '10011000')
    s = s.replace('K', '0110')
    s = s.replace('L', '00100')
    s = s.replace('M', '10011001')
    s = s.replace('N', '10011110')
    s = s.replace('O', '00101')
    s = s.replace('P', '111')
    s = s.replace('Q', '10011111')
    s = s.replace('R', '1000')
    s = s.replace('S', '00110')
    s = s.replace('T', '00111')
    s = s.replace('U', '10011100')
    s = s.replace('V', '10011101')
    s = s.replace('W', '000010')
    s = s.replace('X', '10010010')
    s = s.replace('Y', '10010011')
    s = s.replace('Z', '10010000')
    s = s.replace('1', '?')
    s = s.replace('2', ',')
    s = s.replace('3', '-')
    s = s.replace('4', '.')
    s = s.replace('5', '\'')
    s = s.replace('6', '!')
    s = s.replace('7', ':')
    s = s.replace('8', ';')
    s = s.replace('9', '(')
    s = s.replace('0', ')')
    s = s.replace('101', 'A')
    s = s.replace('10011010', 'B')
    s = s.replace('0101', 'C')
    s = s.replace('0001', 'D')
    s = s.replace('110', 'E')
    s = s.replace('01001', 'F')
    s = s.replace('10011011', 'G')
    s = s.replace('010000', 'H')
    s = s.replace('0111', 'I')
    s = s.replace('10011000', 'J')
    s = s.replace('0110', 'K')
    s = s.replace('00100', 'L')
    s = s.replace('10011001', 'M')
    s = s.replace('10011110', 'N')
    s = s.replace('00101', 'O')
    s = s.replace('111', 'P')
    s = s.replace('10011111', 'Q')
    s = s.replace('1000', 'R')
    s = s.replace('00110', 'S')
    s = s.replace('00111', 'T')
    s = s.replace('10011100', 'U')
    s = s.replace('10011101', 'V')
    s = s.replace('000010', 'W')
    s = s.replace('10010010', 'X')
    s = s.replace('10010011', 'Y')
    s = s.replace('10010000', 'Z')
    s = s.replace('?', '1')
    s = s.replace(',', '2')
    s = s.replace('-', '3')
    s = s.replace('.', '4')
    s = s.replace('\'', '5')
    s = s.replace('!', '6')
    s = s.replace(':', '7')
    s = s.replace(';', '8')
    s = s.replace('(', '9')
    s = s.replace(')', '0')
    s = s.replace('101', 'A')
    s = s.replace('10011010', 'B')
    s = s.replace('0101', 'C')
    s = s.replace('0001', 'D')
    s = s.replace('110', 'E')
    s = s.
