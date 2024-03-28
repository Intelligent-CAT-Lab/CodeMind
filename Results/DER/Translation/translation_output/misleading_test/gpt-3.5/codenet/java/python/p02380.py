```python
import math

class p02380:
    def run(self, in_stream, out_stream):
        sc = input_stream(in_stream)
        a, b, cc = sc.read_double(), sc.read_double(), sc.read_double()
        cc = math.radians(cc)

        s = a * b * math.sin(cc) / 2.0
        l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
        h = b * math.sin(cc)

        print(s, file=out_stream)
        print(l, file=out_stream)
        print(h, file=out_stream)

        sc.close()

if __name__ == "__main__":
    p02380().run(sys.stdin, sys.stdout)
```
To test the given input (4 3 90), you can run the Python code and pass the input manually.
