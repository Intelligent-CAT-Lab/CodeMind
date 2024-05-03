import math

def main():
    l = input()
    answer = math.floor(int(l.split()[0]) / 3)
    print(answer)

if __name__ == "__main__":
    main()