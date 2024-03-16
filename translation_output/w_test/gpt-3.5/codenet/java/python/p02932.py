```python
import sys
import math

class Modular:
    def __init__(self, m):
        self.m = m

    def value_of(self, x):
        x %= self.m
        if x < 0:
            x += self.m
        return x

    def mul(self, x, y):
        return self.value_of(x * y)

    def plus(self, x, y):
        return self.value_of(x + y)

    def subtract(self, x, y):
        return self.value_of(x - y)


class Composite:
    def __init__(self, limit, modular):
        self.factorial = Factorial(limit, modular)
        self.modular = modular

    def composite(self, m, n):
        if n > m:
            return 0
        return self.modular.mul(self.modular.mul(self.factorial.fact[m], self.factorial.inv[n]),
                                self.factorial.inv[m - n])


class NumberTheory:
    class Factorial:
        def __init__(self, limit, modular):
            self.fact = [0] * (limit + 1)
            self.inv = [0] * (limit + 1)
            self.inv[0] = 1
            self.modular = modular
            for i in range(1, limit + 1):
                self.fact[i] = modular.mul(self.fact[i - 1], i)
                self.inv[i] = modular.mul(self.inv[i - 1], modular.inverse(i))

    class FastIO:
        def __init__(self, is_, os, charset):
            self.is_ = is_
            self.os = os
            self.charset = charset
            self.buf = b""
            self.buf_offset = 0
            self.next_ = 0

        def read(self):
            while self.buf_offset == len(self.buf):
                self.buf_offset = 0
                self.buf = self.is_.read(1 << 20)
                if not self.buf:
                    return -1
            val = self.buf[self.buf_offset]
            self.buf_offset += 1
            return val

        def skip_blank(self):
            while self.next_ >= 0 and self.next_ <= 32:
                self.next_ = self.read()

        def read_int(self):
            sign = 1

            self.skip_blank()
            if self.next_ == 43 or self.next_ == 45:
                sign = 1 if self.next_ == 43 else -1
                self.next_ = self.read()

            val = 0
            if sign == 1:
                while self.next_ >= 48 and self.next_ <= 57:
                    val = val * 10 + self.next_ - 48
                    self.next_ = self.read()
            else:
                while self.next_ >= 48 and self.next_ <= 57:
                    val = val * 10 - self.next_ + 48
                    self.next_ = self.read()

            return val

        def read_string(self):
            result = ""
            self.skip_blank()
            while self.next_ > 32:
                result += chr(self.next_)
                self.next_ = self.read()

            return result

    def solve(n, m, l, r):
        mod = Modular(1000000007)
        composite = Composite(1000000, mod)
        l_part = m
        r_part = n - m
        cache1 = [0] * (r + 1)
        cache2 = [0] * (r + 1)

        for x in range(1, r + 1):
            local_sum = 0
            for j in range(r_part + 1):
                c = composite.composite(r_part, j)
                number_of_x = l_part + j
                sub = number_of_x * x
                if number_of_x * x > r:
                    break
                plus = mod.mul(c, mod.subtract(in_range(n, r - sub), in_range(n, l - 1 - sub)))
                if j & 1 == 1:
                    plus = -plus
                local_sum = mod.plus(local_sum, plus)
            cache1[x] = mod.mul(local_sum, composite.composite(n, l_part))

        for x in range(1, r + 1):
            local_sum = 0
            for j in range(r_part + 1):
                c = composite.composite(r_part, j)
                number_of_x = l_part + j
                sub = number_of_x * x + l_part
                if number_of_x * x + l_part > r:
                    break
                plus = mod.mul(c, mod.subtract(in_range(n, r - sub), in_range(n, l - 1 - sub)))
                if j & 1 == 1:
                    plus = -plus
                local_sum = mod.plus(local_sum, plus)
            cache2[x] = mod.mul(local_sum, composite.composite(n, l_part))

        sum_result = mod.subtract(in_range(n, r), in_range(n, l - 1))
        for i in range(r + 1):
            plus = mod.subtract(cache1[i], cache2[i])
            sum_result = mod.subtract(sum_result, plus)

        return sum_result

    def in_range(n, m):
        return Factorial.composite(m + n, n)

    def main():
        n, m, l, r = map(int, input().split())
        result = solve(n, m, l, r)
        print(result)

    main()
```

