s = input()
arr = list(s)

for i in range(len(s)//2):
    if arr[i] != arr[len(s)-1-i]:
        print("No")
        break
else:
    for i in range(len(s)//2-1):
        if arr[i] != arr[(len(s)//2)-1-i]:
            print("No")
            break
    else:
        print("Yes")