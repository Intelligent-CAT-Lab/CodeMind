import math

def main():
    lines = input().split(" ")
    list_values = [float(value) for value in lines]
    print(math.sqrt((list_values[0] - list_values[2])**2 + (list_values[1] - list_values[3])**2))

if __name__ == "__main__":
    main()