import sys

n, w = map(int, input().split())

flag = [False] * (n + 1)
count = [0] * (n + 1)
sum = 0
left = 1
right = w + 1

for i in range(1, w + 1):
    for k in range(1, i + 1):
        if i % k == 0:
            count[k] += 1
            update(k)
            if i // k != k:
                count[i // k] += 1
                update(i // k)

for i in range(1, n - w + 2):
    left = i + 1
    right = i + w + 1
    for k in range(1, i + w + 1):
        if (i + w) % k == 0:
            count[k] += 1
            update(k)
            if (i + w) // k != k:
                count[(i + w) // k] += 1
                update((i + w) // k)
    update(left - 1)
    update(right - 1)

    print(sum + (" " if i < n - w else "\n"))

def update(i):
    det = left <= i and i < right
    if flag[i] and not det and count[i] < 2:
        flag[i] = False
        sum -= 1
    elif not flag[i] and (det or count[i] >= 2):
        flag[i] = True
        sum += 1

if __name__ == "__main__":
    sys.setout(sys.stdout)
    p01606().run()
    sys.stdout.flush()