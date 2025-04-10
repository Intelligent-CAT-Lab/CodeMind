from math import pi, fabs
class TriCalculator: 
    def __init__(self):
        pass

    def factorial(self, a):
        b = 1
        while a != 1:
            b *= a
            a -= 1
        return b