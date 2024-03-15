import sys

def strkn(ans):
    ans.sort(reverse=True)
    result = str(ans[0]) + " " + str(ans[1]) + " " + str(ans[2]) + " " + str(ans[3]) + " " + str(ans[4])
    return result

ans = [1,1,1,1,1]
count = 0
for line in sys.stdin:
    num = int(line)
    ans[count] = num
    count += 1
    if count == 5:
        print(strkn(ans))
        break

/2019-09-16/README.md
# 2019-09-16