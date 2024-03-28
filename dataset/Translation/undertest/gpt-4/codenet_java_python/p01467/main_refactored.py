class main:
    def ni(num_str):
        a = [int(x) for x in str(num_str).zfill(10)][::-1]
        return a
    
    def main():
        a_str, b_str, k = input().split()
        a = ni(a_str)
        b = ni(b_str)
        k = int(k)
        max_num = 0
        for i in range(1 << 10):
            if bin(i).count('1') > k:
                continue
            borrow = [0] * 11
            c = [0] * 10
            for j in range(10):
                if a[j] - borrow[j] >= b[j]:
                    c[j] = a[j] - borrow[j] - b[j]
                    borrow[j + 1] = 0
                else:
                    c[j] = a[j] - borrow[j] + 10 - b[j]
                    borrow[j + 1] = 0 if (i & (1 << j)) > 0 else 1
            
            ans = 0
            for j in range(9, -1, -1):
                ans *= 10
                ans += c[j]
            max_num = max(max_num, ans)
        print(max_num)
    
    if __name__ == "__main__":
        main()