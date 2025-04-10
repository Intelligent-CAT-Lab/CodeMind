from math import pi, fabs
class TriCalculator: 
    def __init__(self):
        pass

    def taylor(self, x, n):
        a = 1
        x = x / 180 * pi
        count = 1
        for k in range(1, n):
            if count % 2 != 0:
                a -= (x ** (2 * k)) / self.factorial(2 * k)
            else:
                a += (x ** (2 * k)) / self.factorial(2 * k)
            count += 1
        return a
    def factorial(self, a):
        b = 1
        while a != 1:
            b *= a
            a -= 1
        return b