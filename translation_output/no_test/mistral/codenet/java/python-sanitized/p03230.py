import sys

def combination(target, k, list):
    if len(list) == k:
        v += 1
        for i in list:
            ansList[i].append(v)
        return

    i = 0
    if list:
        i = list[-1] + 1
        if len(list) + len(target) - i < k:
            return

    for i in range(i, len(target)):
        list.append(i)
        combination(target, k, list)
        list.pop()

n = int(input())
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
for i in range(3, n+1):
    ic2 = i * (i-1) // 2
    if ic2 == n:
        k = i
        break
    elif ic2 > n:
        print("No")
        return

print("Yes")

ansList = []
target = []
for i in range(k):
    ansList.append([])
    target.append(i)

combination(target, 2, [])

print(k)
for i in range(k):
    sb = StringBuilder()
    sb.append(k-1).append(' ')
    list = ansList[i]
    for j in list:
        sb.append(j).append(' ')
    sb.deletecharat(sb.len()-1)
    print(sb.toString())

def main():
    combination(target, k, list)

if __name__ == "__main__":
    main()