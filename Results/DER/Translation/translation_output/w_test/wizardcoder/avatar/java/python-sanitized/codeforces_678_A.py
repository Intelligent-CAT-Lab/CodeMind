import java.util.Scanner

def main():
    input = Scanner(System.in)
    n = input.nextInt()
    k = input.nextInt()
    
    print((n // k + 1) * k)

if __name__ == '__main__':
    main()