import sys
from itertools import combinations

def main():
    n = int(sys.stdin.readline())

    if n == 1:
        print("Yes")
        print(2)
        print("1 1")
        print("1 1")
        return
    if n == 2:
        print("No")
        return

    k = 0
    for i in range(3, n + 1):
        ic2 = i * (i - 1) // 2
        if ic2 == n:
            k = i
            break
        elif ic2 > n:
            print("No")
            return

    print("Yes")

    ans_list = [[] for _ in range(k)]
    target = list(range(k))
    combination(target, 2, [], ans_list)

    print(k)
    for i in range(k):
        print(f"{len(ans_list[i]) - 1} {' '.join(map(str, ans_list[i]))}")

def combination(target, k, list, ans_list):
    if len(list) == k:
        for i in list:
            ans_list[i].append(len(ans_list[i]) + 1)
        return

    i = 0
    if list:
        i = list[-1] + 1
        if len(list) + len(target) - i < k:
            return

    for j in range(i, len(target)):
        list.append(j)
        combination(target, k, list, ans_list)
        list.pop()

if __name__ == "__main__":
    main()