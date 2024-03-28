import math

def main():
    try:
        sc = input("Enter two numbers: ")
        sc = sc.split()
        num1 = int(sc[0])
        num2 = int(sc[1])
        diff = abs(num1 - num2)
        if diff <= 1:
            print("Brown")
        else:
            print("Alice")
    except ValueError:
        print("Invalid input")

if __name__ == "__main__":
    main()