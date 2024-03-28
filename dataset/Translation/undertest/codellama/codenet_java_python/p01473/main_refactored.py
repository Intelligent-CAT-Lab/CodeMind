class main:
    import sys
    
    MAX = 20
    
    def main():
        facts = [1] * (MAX + 1)
        for i in range(1, MAX + 1):
            facts[i] = facts[i - 1] * i
    
        count = [0] * 26
        input = sys.stdin.readline().strip()
    
        for c in input:
            count[ord(c) - ord('a')] += 1
    
        allow_odd = 0 if len(input) % 2 == 0 else 1
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
    
        sum = facts[valid]
        for i in range(26):
            sum //= facts[count[i]]
    
        print(sum)
    
    if __name__ == "__main__":
        main()