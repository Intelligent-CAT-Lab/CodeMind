
class BigNumCalculator: 
    def add(num1, num2):
        max_length = max(len(num1), len(num2))
        num1 = num1.zfill(max_length)
        num2 = num2.zfill(max_length)

        carry = 0
        result = []
        for i in range(max_length - 1, -1, -1):
            digit_sum = int(num1[i]) + int(num2[i]) + carry
            carry = digit_sum // 10
            digit = digit_sum % 10
            result.insert(0, str(digit))

        if carry > 0:
            result.insert(0, str(carry))

        return ''.join(result)