class main:
    import sys
    
    def main():
        input = sys.stdin.read()
        data = list(map(int, input.split()))
        n = data[0]
        if n == 3:
            print("2 5 63")
            return
        elif n == 4:
            print("2 5 20 63")
            return
        ans = []
        _2 = 0
        _3 = 0
        _23 = 0
        i = 2
        while len(ans) < n - 2:
            num = i
            if num % 2 == 0 and num % 3 == 0:
                _23 += 1
            elif num % 2 == 0:
                _2 += num
            elif num % 3 == 0:
                _3 += num
            if num % 2 == 0 or num % 3 == 0:
                ans.append(num)
            i += 1
        k = i
        sn = -1
        for i in range(k, 1000000000):
            num = i
            if num % 2 == 0 and (_2 % 3 == 0 or num % 3!= 0) and (_2 + num) % 3 == 0:
                sn = num
                ans.append(num)
                break
        i = k
        for i in range(k, 1000000000):
            num = i
            if num % 3 == 0 and (_3 % 2 == 0 or num % 2!= 0) and num!= sn and (_3 + num) % 2 == 0:
                ans.append(num)
                break
        for i in ans:
            print(i, end=' ')
    
    if __name__ == '__main__':
        main()