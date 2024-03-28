import math

def main():
    lines = input().split()
    coords = [float(num) for num in lines]
    distance = math.sqrt((coords[0] - coords[2])**2 + (coords[1] - coords[3])**2)
    print("{:.8f}".format(distance))

if __name__ == '__main__':
    main()