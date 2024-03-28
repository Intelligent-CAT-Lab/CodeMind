class main:
    def strkn(ans):
        ans.sort(reverse=True)
        result = ' '.join(map(str, ans))
        return result
    
    ans = [1,1,1,1,1]
    count = 0
    for num in map(int, input().split()):
        ans[count] = num
        count += 1
        if count == 5:
            print(strkn(ans))
            break