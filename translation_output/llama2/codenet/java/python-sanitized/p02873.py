import sys

def main():
    n = int(sys.stdin.readline())
    s = sys.stdin.readline()
    sum = 0
    ptr = 0
    cnt = 0
    curr = 0
    while ptr < n:
        if s[ptr] == '>':
            while ptr < n and s[ptr] == '>':
                ptr += 1
                cnt += 1
            if curr > cnt:
                sum += (curr + ((cnt * (cnt - 1)) / 2))
            else:
                sum += ((cnt + 1) * (cnt)) / 2
            curr = 0
            cnt = 0
        else:
            sum += curr
            curr += 1
            ptr += 1
    if s[n - 1] == '<':
        sum += curr
    print(sum)


if __name__ == '__main__':
    main()