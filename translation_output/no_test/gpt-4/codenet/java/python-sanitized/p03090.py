import sys

def solve(a, l):
    if a % 2 == 0:
        for i in range(1, a // 2 + 1):
            for j in range(i + 1, a // 2 + 1):
                l.append(f"{i} {j}")
                l.append(f"{i} {a + 1 - j}")
                l.append(f"{a + 1 - i} {j}")
                l.append(f"{a + 1 - i} {a + 1 - j}")
    else:
        solve(a - 1, l)
        for i in range(1, a):
            l.append(f"{a} {i}")

def out(num_list):
    for num in num_list:
        print(num)

def out_str(s):
    if dbg:
        print(s)

def ni():
    return int(input())

def ns():
    return input()

def ni_arr(k):
    return [int(input()) for _ in range(k)]

def ns_arr(k):
    return [input() for _ in range(k)]

def ni_matrix(a, b):
    return [[int(x) for x in input().split()] for _ in range(a)]

# Main execution starts here
dbg = True

def main():
    a = ni()
    l = []
    solve(a, l)
    print(len(l))
    for str_ in l:
        out_str(str_)

if __name__ == "__main__":
    main()