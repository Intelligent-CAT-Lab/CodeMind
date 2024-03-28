import sys

def solve(a):
    l = []
    
    if a % 2 == 0:
        for i in range(1, a//2 + 1):
            for j in range(i+1, a//2 + 1):
                l.append(f"{i} {j}")
                l.append(f"{i} {a+1-j}")
                l.append(f"{a+1-i} {j}")
                l.append(f"{a+1-i} {a+1-j}")
    else:
        l = solve(a-1)
        for i in range(1, a):
            l.append(f"{a} {i}")
    
    return l


def main():
    a = int(input())

    l = solve(a)
    print(len(l))
    for item in l:
        print(item)


if __name__ == "__main__":
    main()