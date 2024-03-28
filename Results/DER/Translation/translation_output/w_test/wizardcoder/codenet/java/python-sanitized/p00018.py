import sys

def strkn(ans):
    ans.sort(reverse=True)
    return " ".join(map(str, ans))

if __name__ == '__main__':
    ans = [1,1,1,1,1]
    count = 0
    while True:
        try:
            num = int(input())
            ans[count] = num
            count += 1
            if count == 5:
                print(strkn(ans))
                break
        except EOFError:
            break