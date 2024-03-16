import sys

def main():
    input_string = sys.stdin.readline().strip()
    list = input_string.split()
    a = 'A'
    sum = 0
    for i in range(len(list)):
        if list[i] <= a:
            sum += 1
        a = list[i]
    print(sum)

if __name__ == '__main__':
    main()