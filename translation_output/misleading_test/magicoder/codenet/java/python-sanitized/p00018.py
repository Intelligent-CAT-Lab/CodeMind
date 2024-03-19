def strkn(ans):
    ans.sort(reverse=True)
    result = ' '.join(map(str, ans))
    return result

if __name__ == "__main__":
    ans = []
    while True:
        try:
            num = int(input())
            ans.append(num)
            if len(ans) == 5:
                print(strkn(ans))
                break
        except EOFError:
            break