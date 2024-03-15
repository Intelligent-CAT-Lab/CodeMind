import java.util

def main():
    #input
    sc = input()

    #calculation
    ans = 1L
    for N in sc.split():
        ans *= int(N)

    #output
    print(ans)

if __name__ == '__main__':
    main()