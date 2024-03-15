import java.util

def main():
    sc = java.util.Scanner(System.in)
    a = sc.nextInt()
    b = sc.nextInt()
    if a + b == 15:
        print("+")
    elif a * b == 15:
        print("*")
    else:
        print("x")

if __name__ == "__main__":
    main()