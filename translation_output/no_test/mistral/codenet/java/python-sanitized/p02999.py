import java.util.Scanner

def main():
    sc = Scanner(System.in)
    a = sc.nextInt()  # input Integer
    b = sc.nextInt()  # input Integer
    if a < b:
        print(0)
    else:
        print(10)

if __name__ == '__main__':
    main()