class main:
    def solve(n, k):
        for bit in range(2**n):
            if bin(bit).count('1') != k:
                continue
            print(f"{bit}:", end="")
            for j in range(n):
                if ((bit >> j) & 1) == 1:
                    print(f" {j}", end="")
            print()
    
    
    def main():
        n, k = map(int, input().split())
        solve(n, k)
    
    
    if __name__ == "__main__":
        main()