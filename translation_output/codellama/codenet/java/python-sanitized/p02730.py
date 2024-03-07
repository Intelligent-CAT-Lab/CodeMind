import sys

s = sys.stdin.readline().strip()
arr = list(s)

for i in range(len(s) // 2):
    if arr[i] != arr[len(s) - 1 - i]:
        print("No")
        sys.stdout.flush()
        return

for i in range(len(s) // 2 - 1):
    if arr[i] != arr[(len(s) // 2) - 1 - i]:
        print("No")
        sys.stdout.flush()
        return

print("Yes")
sys.stdout.flush()