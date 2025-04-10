import unittest
class NumberConverter:
    @staticmethod
    def decimal_to_binary(decimal_num):
        binary_num = bin(decimal_num)[2:]
        return binary_num

    @staticmethod
    def binary_to_decimal(binary_num):
        decimal_num = int(binary_num, 2)
        return decimal_num

    @staticmethod
    def decimal_to_octal(decimal_num):
        octal_num = oct(decimal_num)[2:]
        return octal_num

    @staticmethod
    def octal_to_decimal(octal_num):
        decimal_num = int(octal_num, 8)
        return decimal_num

    @staticmethod
    def decimal_to_hex(decimal_num):
        hex_num = hex(decimal_num)[2:]
        return hex_num

    @staticmethod
    def hex_to_decimal(hex_num):
        decimal_num = int(hex_num, 16)
        return decimal_num
class Test(unittest.TestCase):
    def test(self):
            return NumberConverter.octal_to_decimal('51427')