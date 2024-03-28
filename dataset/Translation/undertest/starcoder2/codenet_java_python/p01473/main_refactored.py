class main:
    import math
    
    def main():
        input_str = input()
        count = [0] * 26
        for c in input_str:
            count[ord(c) - ord('a')] += 1
        allow_odd = 0 if len(input_str) % 2 == 0 else 1
        odd_count = 0
        odd_pos = -1
        for i in range(26):
            if count[i] % 2 == 1:
                odd_count += 1
                odd_pos = i
        if allow_odd < odd_count:
            print(0)
            return
        if odd_pos != -1:
            count[odd_pos] -= 1
        for i in range(26):
            count[i] //= 2
        valid = 0
        for i in range(26):
            valid += count[i]
        sum = math.factorial(valid)
        for i in range(26):
            sum //= math.factorial(count[i])
        print(sum)
    
    if __name__ == '__main__':
        main()