import sys

def main():
    list = sys.stdin.readline().split()
    a = ord('A')
    sum = 0
    for i in range(len(list)):
        if int(list[i]) <= a:
            sum += 1
        a = int(list[i])
    print(sum)

if __name__ == '__main__':
    main()