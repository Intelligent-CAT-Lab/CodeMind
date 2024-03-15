import java.util
import java.io

def main():
    n = int(input())
    k = int(input())
    if (n*k) % 2 == 1:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()