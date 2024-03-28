class main:
    def main():
        n, k = map(int, input().split())
    
        num = [0] * k
    
        for i in range(1, n + 1):
            num[i % k] += 1
    
        res = 0
        for a in range(k):
            b = (k - a) % k
            c = b  # This line is directly from Java code. In Java, b and c will be the same due to integer division.
            if (b + c) % k != 0:
                continue
            res += num[a] * num[b] * num[c]
    
        print(res)
    
    if __name__ == "__main__":
        main()