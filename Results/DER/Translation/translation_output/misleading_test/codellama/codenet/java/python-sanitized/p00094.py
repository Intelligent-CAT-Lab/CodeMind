import math

def main():
    sc = input("Enter two numbers separated by a space: ")
    numbers = sc.split()
    result = (float(numbers[0]) * float(numbers[1])) / 3.305785
    print(result)

if __name__ == "__main__":
    main()