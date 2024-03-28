class ModCalculator:
    def __init__(self, mod):
        self.mod = mod

    def add(self, a, b):
        return (a + b) % self.mod

    def sub(self, a, b):
        return (a - b + self.mod) % self.mod

    def mul(self, a, b):
        return (a * b) % self.mod

    def pow(self, a, b):
        if b == 0:
            return 1
        v = self.pow(self.mul(a, a), b // 2)
        if b % 2 == 1:
            return self.mul(v, a)
        else:
            return v

    def inverse(self, a):
        return self.pow(a, self.mod - 2)

    def div(self, a, b):
        return self.mul(a, self.inverse(b))


class ModCombinationCache:
    def __init__(self, mod_calculator):
        self.mod_calculator = mod_calculator
        self.factorial_cache = [1]
        self.factorial_inverse_cache = [1]

    def resize(self, n):
        for i in range(len(self.factorial_cache), n + 1):
            v = self.mod_calculator.mul(self.factorial_cache[-1], i)
            self.factorial_cache.append(v)
            self.factorial_inverse_cache.append(self.mod_calculator.inverse(v))

    def get_p(self, n):
        self.resize(n)
        return self.factorial_cache[n]

    def get_c(self, n, k):
        self.resize(n)
        return self.mod_calculator.mul(self.factorial_cache[n], self.mod_calculator.mul(self.factorial_inverse_cache[k], self.factorial_inverse_cache[n - k]))


def solve(n, a, b, c):
    if b % 2 == 1:
        return 0

    mc = ModCalculator(1_000_000_007)
    mcc = ModCombinationCache(mc)
    answer = 0
    for x in range(a, -1, -1):
        group1 = x

        rest_a = a - x
        group2 = rest_a

        rest_c1 = c - rest_a
        if rest_c1 < 0:
            break
        if b > 0:
            for y in range(rest_c1 // 3 + 1):
                group3 = y
                rest_c2 = rest_c1 - 3 * y
                group4 = b // 2

                count = mcc.get_c(b // 2 + rest_c2 - 1, b // 2 - 1)
                count = mc.mul(count, mcc.get_c(group1 + group2 + group3 + group4, group4))
                count = mc.mul(count, mcc.get_c(group1 + group2 + group3, group3))
                count = mc.mul(count, mcc.get_c(group1 + group2, group2))
                answer = mc.add(answer, count)
        elif rest_c1 % 3 == 0:
            group3 = rest_c1 // 3
            count = mcc.get_c(group1 + group2 + group3, group3)
            count = mc.mul(count, mcc.get_c(group1 + group2, group2))
            answer = mc.add(answer, count)

    return answer


# Test input
n, a, b, c = map(int, input().split())
print(solve(n, a, b, c))