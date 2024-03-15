import java.util
import static java.lang.System
import static java.lang.Math

def main():
    x = [int(input()) for _ in range(3)]
    temp = 2 * x[2] - x[1] - x[0]
    ans = 0
    if temp % 2 == 1:
        ans = (temp + 2) / 2 + 1
    else:
        ans = temp / 2
    print(ans)

if __name__ == '__main__':
    main()