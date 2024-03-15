Here is the Python translation of the given Java code. Note that Python's input handling is simple compared to Java's, and we generally do not need to handle raw byte streams for standard input/output. I'll use Python's built-in `input()` function to retrieve input from the user:

```python
import math

class p03838:
    def __init__(self):
        self.x = 0
        self.y = 0
        
    def solve(self):
        self.x = self.next_int()
        self.y = self.next_int()

        if self.x >= 0:
            if self.y >= 0:
                if self.x > self.y:
                    if self.y == 0:
                        print(self.x - self.y + 1)
                    else:
                        print(self.x - self.y + 2)
                else:
                    print(self.y - self.x)
            else:
                print(abs(abs(self.y) - self.x) + 1)
        else:
            if self.y >= 0:
                if self.y == 0:
                    print(abs(abs(self.x) - self.y))
                else:
                    print(abs(abs(self.x) - self.y) + 1)
            else:
                if self.x > self.y:
                    print(self.x - self.y + 2)
                else:
                    print(self.y - self.x)
                    
    def next_int(self):
        return int(input().strip())
        
    def next_long(self):
        return int(input().strip())
        
    def next_double(self):
        return float(input().strip())

# Main execution
if __name__ == "__main__":
    solver = p03838()
    solver.solve()
```

To keep the example simple, I only implemented the `nextInt`, `nextLong`, and `nextDouble` methods as `next_int`, `next_long`, and `next_double`, respectively. They correspond to Python's way of reading and converting inputs. Note that error handling is not as robust as in the original Java code, and values are expected to be correctly formatted. Also, I've removed the feature of checking for the next byte and only considered the fact that input is line-based, which is standard in Python scripts.
