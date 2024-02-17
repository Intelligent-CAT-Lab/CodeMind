N = int(eval(input()))

def dfs(num):
    if int(num) > N:
        return 0

    # numが753数ならcntを1にセット
    cnt = 0
    flag = 1
    for i in "753":
        if not num.count(i):
            flag = 0
            break
    if flag:
        cnt += 1

    for i in "753":
        cnt += dfs(num + i)

    return cnt

print((dfs("0")))
