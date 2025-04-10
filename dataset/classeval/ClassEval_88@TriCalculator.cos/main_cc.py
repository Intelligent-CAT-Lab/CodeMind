from math import pi, fabs
class TriCalculator: 
    def __init__(self):
        pass

    def cos(self, x):
        return round(self.taylor(x, 50), 10)
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