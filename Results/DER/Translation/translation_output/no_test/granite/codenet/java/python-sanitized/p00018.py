import sys

def strkn(ans):
    ans.sort(reverse=True)
    return''.join(map(str, ans[:5]))

ans = [1,1,1,1,1]
count = 0
for num in sys.stdin:
    ans[count] = int(num)
    count += 1
    if count == 5:
        print(strkn(ans))
        break