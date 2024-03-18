def strkn(ans):
    ans.sort(reverse=True)
    result = " ".join(map(str, ans))
    return result

if __name__ == "__main__":
    ans = [1, 1, 1, 1, 1]
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
            print(strkn(ans) + " -100")
            break