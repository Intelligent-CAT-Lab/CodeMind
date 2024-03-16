Here's the translated Python code from the original Java code:

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

class Task:

    def solve(self):
        N, d = map(int, input().split())

        if d == 1:
            ans = N * (N - 1) // 2
        elif d == 2:
            ans = N * (N - 1) // 2 - 1
        else:
            m = N - d
            ans = m * (m - 1) // 2 + 2 * m + (d - 2)

        print(ans)

def main():
    Task().solve()

if __name__ == "__main__":
    main()
```

Please note that Python does not have a built-in "FastScanner" class equivalent. In Python, input and output are often handled differently; usually, using the built-in `input()` function and `print()` function, which are much slower than Java's Scanner and PrintWriter classes.

For competitive programming purposes, the Python code uses `input()` to read from standard input and `print()` for output, which suffices for many cases. If faster input/output is needed for very large data sets, you can use `sys.stdin.readline()` instead of `input()` and `sys.stdout.write()` instead of `print()`. However, in this translated version, the standard `input()` and `print()` functions are used for simplicity and because the code snippet provided does not specify the context in which the input/output speed is critical.
