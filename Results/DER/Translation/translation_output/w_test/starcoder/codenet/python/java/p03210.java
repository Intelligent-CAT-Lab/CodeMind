<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5

Expected output:
YES


```
# -*- coding: utf-8 -*-
"""
Created on Wed Jan  2 15:24:02 2019

@author: Yamazaki Kenichi
"""

X = input()

if X=='7' or X=='5' or X=='3':
    ans = 'YES'
else:
    ans = 'NO'

print(ans)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.next();
        if (X.equals("7") || X.equals("5") || X.equals("3")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
"""

import unittest


class Test(unittest.TestCase):
    def test_case01(self):
        self.assertEqual(main('7'), 'YES')

    def test_case02(self):
        self.assertEqual(main('5'), 'YES')

    def test_case03(self):
        self.assertEqual(main('3'), 'YES')

    def test_case04(self):
        self.assertEqual(main('1'), 'NO')

    def test_case05(self):
        self.assertEqual(main('2'), 'NO')

    def test_case06(self):
        self.assertEqual(main('4'), 'NO')

    def test_case07(self):
        self.assertEqual(main('6'), 'NO')

    def test_case08(self):
        self.assertEqual(main('8'), 'NO')

    def test_case09(self):
        self.assertEqual(main('9'), 'NO')


def main(X):
    if X == '7' or X == '5' or X == '3':
        ans = 'YES'
    else:
        ans = 'NO'
    return ans


if __name__ == '__main__':
    unittest.main()
<|endoftext|>
