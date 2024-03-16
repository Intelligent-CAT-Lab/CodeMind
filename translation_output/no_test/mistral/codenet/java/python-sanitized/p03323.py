import java.util

def main():
    sc = java.util.Scanner(System.in)
    a = sc.nextInt()
    b = sc.nextInt()
    if a <= 8 and b <= 8:
        print("Yay!")
    else:
        print(":(")

if __name__ == "__main__":
    main()