import sys

def solve(c):
    if c == 0:
        if check():
            return 1
        else:
            return 0

    ret = 0

    for i in range(4):
        for j in range(3):
            if nums[i][j] == -1:
                for k in range(1, 10):
                    if not used[k]:
                        nums[i][j] = k
                        used[k] = True
                        ret += solve(c - 1)
                        nums[i][j] = -1
                        used[k] = False
                break

    return ret

def check():
    a = [nums[i][0] * 100 + nums[i][1] * 10 + nums[i][2] for i in range(4)]
    return a[0] + a[1] + a[2] == a[3]

if __name__ == '__main__':
    nums = [[-1, -1, -1], [-1, -1, -1], [-1, -1, -1], [-1, -1, -1]]
    used = [False] * 10

    words = sys.stdin.readline().strip().split()
    count = 0

    for i in range(len(words)):
        if words[i]!= '-1':
            used[int(words[i])] = True
        else:
            count += 1
        nums[layout[i][0]][layout[i][1]] = int(words[i])

    print(solve(count))