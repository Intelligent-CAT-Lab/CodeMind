from itertools import combinations

v = 0
ansList = []

def main():
    global ansList
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
        ic2 = i * (i - 1) // 2
        if ic2 == n:
            k = i
            break
        elif ic2 > n:
            print("No")
            return
    print("Yes")

    ansList = [[] for _ in range(k)]
    target = list(range(k))
    generate_combinations(target, 2)

    print(k)
    for i in range(k):
        print(k - 1, *ansList[i])

def generate_combinations(target, k):
    global v, ansList
    for combo in combinations(target, k):
        v += 1
        for i in combo:
            ansList[i].append(v)

if __name__ == "__main__":
    main()