def strkn(ans):
    ans.sort(reverse=True)
    result = ' '.join(map(str, ans))
    return result

ans = [1,1,1,1,1]
count = 0
while True:
    num = int(input())
    ans[count] = num
    count += 1
    if count == 5:
        print(strkn(ans))
        break