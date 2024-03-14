import sys

def main():
    ans = [1, 1, 1, 1, 1]
    count = 0
    for line in sys.stdin:
        num = int(line)
        ans[count] = num
        count += 1
        if count == 5:
            print(strkn(ans))
            break

def strkn(ans):
    ans.sort(reverse=True)
    result = ' '.join(map(str, ans))
    return result

if __name__ == "__main__":
    main()