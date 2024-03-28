import math

def main():
    lines = input().split()
    list = [float(x) for x in lines]
    a = list[0]
    b = list[1]
    c = list[2]
    d = list[3]
    distance = math.sqrt((a-c)**2 + (b-d)**2)
    print(distance)

if __name__ == '__main__':
    main()