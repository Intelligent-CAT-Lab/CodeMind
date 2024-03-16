Here is a Python translation of the provided Java code. You can run this Python code to achieve the same functionality:

```python
class Util:
    M07 = 1000_000_007
    _m = M07
    fact = [0] * 1000001
    inv = [0] * 1000001
    ifact = [0] * 1000001

    @classmethod
    def initialize(cls):
        cls.fact[0], cls.fact[1] = 1, 1
        cls.ifact[0], cls.ifact[1] = 1, 1
        cls.inv[0], cls.inv[1] = 0, 1
        for i in range(2, len(cls.inv)):
            cls.inv[i] = (cls._m - (cls._m // i) * cls.inv[cls._m % i] % cls._m) % cls._m
        for i in range(2, len(cls.fact)):
            cls.fact[i] = i * cls.fact[i - 1] % cls._m
            cls.ifact[i] = cls.inv[i] * cls.ifact[i - 1] % cls._m

    @classmethod
    def c(cls, a, b):
        if cls.fact[0] == 0:
            cls.initialize()
        return cls.ifact[a] * cls.ifact[b - a] % cls._m * cls.fact[b] % cls._m

    @classmethod
    def fact_func(cls, a):
        if cls.fact[0] == 0:
            cls.initialize()
        return cls.fact[a]


def solve(i):
    md = [0] * i

    rm = i - 2
    lx = i - 2
    while rm >= 0:
        md[lx + 1] = Util.c(rm, lx)
        rm -= 2
        lx -= 1

    res = 0
    prev = 0
    for m in range(1, i):
        cur = Util.fact_func(m) * Util.fact_func(i - m - 1) % Util._m
        cur = cur * md[m] % Util._m

        res += (cur - prev + Util._m) * m % Util._m
        prev = cur

    return res % Util._m


# Test Case
if __name__ == "__main__":
    i = int(input().strip())
    print(solve(i))
```

You can provide an integer input to this Python program and it will output the expected result. In this case, if you input 4, the output will be 16, matching the expected output for the provided test case.
