Here is the translated Python code from the Java snippet you provided:

```python
import sys

class P02251:
    def solve(self):
        n = self.next_int()
        ans = 0
        
        # 25 cent
        ans += n // 25
        n %= 25
        
        # 10 cent
        ans += n // 10
        n %= 10
        
        # 5 cent
        ans += n // 5
        n %= 5
        
        # 1 cent
        ans += n
        
        print(ans)

    def next_int(self):
        return int(self.next())
    
    def next(self):
        return sys.stdin.readline().strip()
    
    def run(self):
        self.solve()

if __name__ == "__main__":
    P02251().run()
```

Please note that the Java code includes a lot of utility functions and a custom input handling method that replicate the behavior of a "Fast Scanner". In Python, console input operations by default are not as slow as in Java, so we don't need to make use of such complex input buffering techniques.

For the sake of simplicity and assuming that the problem deals with standard input only, I've replaced all the input-related code with Python's `sys.stdin.readline().strip()`. Keep in mind that if you have more stringent performance requirements or need to process large amounts of data very quickly, you may need to implement more sophisticated input/output handling similar to what's shown in the original Java code.

Additionally, in Python you can print directly to standard output using `print()`. There is no need to create a PrintWriter equivalent for basic use cases.
