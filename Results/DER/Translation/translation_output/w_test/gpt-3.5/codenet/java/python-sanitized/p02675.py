N = int(input())

if N % 10 in [2, 4, 5, 7, 9]:
    print("hon")
elif N % 10 in [0, 1, 6, 8]:
    print("pon")
else:
    print("bon")