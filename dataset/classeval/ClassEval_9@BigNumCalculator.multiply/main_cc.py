
class BigNumCalculator: 
    @staticmethod
    def multiply(num1, num2):
        len1, len2 = len(num1), len(num2)
        result = [0] * (len1 + len2)

        for i in range(len1 - 1, -1, -1):
            for j in range(len2 - 1, -1, -1):
                mul = int(num1[i]) * int(num2[j])
                p1, p2 = i + j, i + j + 1
                total = mul + result[p2]

                result[p1] += total // 10
                result[p2] = total % 10

        start = 0
        while start < len(result) - 1 and result[start] == 0:
            start += 1

        return ''.join(map(str, result[start:]))