import unittest
class ComplexCalculator:
    def __init__(self):
        pass

    @staticmethod
    def add(c1, c2):
        real = c1.real + c2.real
        imaginary = c1.imag + c2.imag
        answer = complex(real, imaginary)
        return answer
    
    @staticmethod
    def subtract(c1, c2):
        real = c1.real - c2.real
        imaginary = c1.imag - c2.imag
        return complex(real, imaginary)
    
    @staticmethod
    def multiply(c1, c2):
        real = c1.real * c2.real - c1.imag * c2.imag
        imaginary = c1.real * c2.imag + c1.imag * c2.real
        return complex(real, imaginary)
    
    @staticmethod
    def divide(c1, c2):
        denominator = c2.real**2 + c2.imag**2
        real = (c1.real * c2.real + c1.imag * c2.imag) / denominator
        imaginary = (c1.imag * c2.real - c1.real * c2.imag) / denominator
        return complex(real, imaginary)
class Test(unittest.TestCase):
    def test(self):
            complexCalculator = ComplexCalculator()
            return complexCalculator.multiply((1 + 2j), (3 + 4j))