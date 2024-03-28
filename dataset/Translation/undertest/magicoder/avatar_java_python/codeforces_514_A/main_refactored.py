class main:
    def solve(x):
        x = str(x)
        result = ''
        for digit in x:
            digit = int(digit)
            if 9 - digit < digit:
                if len(x) == 1 and 9 - digit == 0:
                    result += str(digit)
                else:
                    result += str(9 - digit)
            else:
                result += str(digit)
        return int(result)
    
    print(solve(5728))