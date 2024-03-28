class main:
    import sys
    
    def main():
        str = sys.stdin.readline().strip()
        n = len(str)
        sum = 0
        ptr = 0
        cnt = 0
        curr = 0
        while ptr < n:
            if str[ptr] == '>':
                while ptr < n and str[ptr] == '>':
                    ptr += 1
                    cnt += 1
                if curr > cnt:
                    sum += curr + ((cnt * (cnt - 1)) // 2)
                else:
                    sum += ((cnt + 1) * cnt) // 2
                curr = 0
                cnt = 0
            else:
                sum += curr
                curr += 1
                ptr += 1
        if str[n - 1] == '<':
            sum += curr
        print(sum)
    
    main()
    
    /p02873.py
    import sys
    
    def main():
        str = sys.stdin.readline().strip()
        n = len(str)
        sum = 0
        ptr = 0
        cnt = 0
        curr = 0
        while ptr < n:
            if str[ptr] == '>':
          tr] == '>':
                    ptr += 1
                    cnt += 1
                if curr > cnt:
                    sum += curr + ((cnt * (cnt - 1)) // 2)
                else:
                    sum += ((cnt + 1) * cnt) // 2
                curr = 0
                cnt = 0
            else:
                sum += curr
                curr += 1
                ptr += 1
        if str[n - 1] == '<':
            sum += curr
        print(sum)
    
    main()
          while ptr < n and str[p