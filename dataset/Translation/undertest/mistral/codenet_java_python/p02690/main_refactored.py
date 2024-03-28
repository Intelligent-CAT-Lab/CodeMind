class main:
    import math
    
    def solve():
        n = int(input())
        powMap = {}
        beforePow = 1
        base = 2
        while True:
            powVal = math.pow(base, 5)
            powMap[powVal] = base
            if powVal - beforePow > n:
                break
            base += 1
            beforePow = powVal
    
        for key, value in powMap.items():
            diff = abs(n - key)
            if key in powMap:
                print(value)
                if key - n < 0:
                    print("-" + powMap[diff])
                else:
                    print(" " + powMap[diff])
                break
    
    def main():
        solve()
    
    if __name__ == "__main__":
        main()