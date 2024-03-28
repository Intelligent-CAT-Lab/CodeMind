Here's the Java code translated to Python:

```python
import sys

"""
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            pass System Test!
"""

def solve(S):
    while len(S) > 3:
        abc = False
        for i in range(len(S) - 2):
            if S[i:i + 3] == "ABC":
                S = S[:i] + "X" + S[i + 3:]
                abc = True

        if not abc:
            print("No")
            return
        
        check = [False] * 3
        for char in S:
            if ord(char) - ord('A') >= 3:
                continue
            check[ord(char) - ord('A')] = True
        
        cnt = sum(1 for t in check if t)
        if cnt != 2:
            print("No")
            return
        
        for i in range(3):
            if not check[i]:
                c = chr(i + ord('A'))
                S = S.replace("X", c)

    if S == "ABC":
        print("Yes")
    else:
        print("No")

def main():
    S = input().strip()
    solve(S)

if __name__ == '__main__':
    main()
```

This translation assumes that the Python program will receive input directly from the command line, similar to reading with `FastScanner` in the Java example. Note that Python's `input()` function is used to read a single line of standard input, which will serve as the `S` string to process in the `solve` function. The `solve` function and `main` function are both adapted directly from the Java `Task.solve` and `p01811.main` methods respectively.
