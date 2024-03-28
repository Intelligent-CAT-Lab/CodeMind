class main:
    inputString = input().split()
    removeDuplication = set(inputString)
    ans = "no"
    if len(inputString) == len(removeDuplication):
        ans = "yes"
    print(ans)