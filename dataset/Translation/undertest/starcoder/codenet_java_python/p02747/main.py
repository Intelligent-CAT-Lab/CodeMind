import sys

S = sys.stdin.readline().strip()

if len(S) % 2 == 1:
    print("No")
else:
    for i in range(0, len(S), 2):
        if S[i:i+2]!= "hi":
            print("No")
            break
    else:
        print("Yes")