from itertools import permutations

def main():
    n = int(input())
    str = ""

    for i in range(1, n+1):
        str += str(i)

    permute(str)

def permute(s):
    perms = [''.join(p) for p in permutations(s)]
    for p in perms:
        print(p)

if __name__ == "__main__":
    main()