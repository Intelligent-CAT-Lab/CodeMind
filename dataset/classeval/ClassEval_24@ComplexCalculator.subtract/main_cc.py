
class ComplexCalculator: 
    def __init__(self):
        pass
    @staticmethod
    def subtract(c1, c2):
        real = c1.real - c2.real
        imaginary = c1.imag - c2.imag
        return complex(real, imaginary)