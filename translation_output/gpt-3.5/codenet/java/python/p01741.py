```python
class p01741:
    def run(self, stdin, stdout):
        import math
        d = float(stdin.readline())
        if d < 1:
            stdout.write(f"{d * math.sqrt(2)}\n")
        elif d < math.sqrt(2):
            stdout.write("2\n")
        elif d < 2:
            stdout.write(f"{d * math.sqrt(2)}\n")
        elif d < math.sqrt(2) * 1.5:
            stdout.write("3\n")
        else:
            stdout.write(f"{d * math.sqrt(2)}\n")

if __name__ == "__main__":
    p01741().run(sys.stdin, sys.stdout)
```
