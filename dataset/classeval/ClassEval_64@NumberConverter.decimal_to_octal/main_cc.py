
class NumberConverter: 
    @staticmethod
    def decimal_to_octal(decimal_num):
        octal_num = oct(decimal_num)[2:]
        return octal_num