import sys

def strkn(ans):
    ans.sort(reverse=True)
    return " ".join(str(x) for x in ans)

if __name__ == "__main__":
    ans = [1, 1, 1, 1, 1]
    count = 0
    for line in sys.stdin:
        num = int(line)
        ans[count] = num
        count += 1
        if count == 5:
            print(strkn(ans))
            break