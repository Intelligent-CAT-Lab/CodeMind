def run():
    s = input()
    arr = list(s)

    for i in range(len(s)//2):
        if arr[i] != arr[len(s)-1-i]:
            print("No")
            return

    for i in range(len(s)//2-1):
        if arr[i] != arr[(len(s)//2)-1-i]:
            print("No")
            return

    print("Yes")

run()