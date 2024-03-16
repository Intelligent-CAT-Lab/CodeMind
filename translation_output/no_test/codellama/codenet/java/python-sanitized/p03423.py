import math

def main():
    l = input()
    st = l.split()
    answer = math.floor(int(st[0]) / 3)
    print(answer)

if __name__ == "__main__":
    main()