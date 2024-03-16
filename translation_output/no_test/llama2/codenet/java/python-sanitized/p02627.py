import java.util

def main():
    sc = java.util.Scanner(System.in)
    str = sc.next()
    print(str.matches("[A-Z]") ? "A" : "a")

if __name__ == "__main__":
    main()