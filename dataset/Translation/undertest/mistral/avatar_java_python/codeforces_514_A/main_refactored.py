class main:
    import sys
    
    def main():
        n = int(input())
        arr = []
        while n > 0:
            r = n % 10
            if 9 - r < r:
                if n // 10 == 0 and 9 - r == 0:
                    arr.append(r)
                else:
                    arr.append(9 - r)
            else:
                arr.append(r)
            n = n // 10
        ans = 0
        for i in range(len(arr)):
            ans += arr[i] * (10 ** i)
        print(ans)
    
    if __name__ == "__main__":
        main()