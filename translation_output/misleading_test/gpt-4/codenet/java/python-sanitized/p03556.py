import math

def execute(number):
    r = int(math.sqrt(number))
    print(r * r)

def main():
    number = int(input())
    execute(number)

if __name__ == '__main__':
    main()