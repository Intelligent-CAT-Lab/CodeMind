import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

def main():
    n = int(input())
    l = int(input())
    diff = []
    for i in range(1, n+1):
        value = l+i-1
        if value < 0:
            value = value * -1
        diff.append(value)
    removeK = diff.index(min(diff)) + 1
    print(n*l + n*(n+1)/2 - n - (l+ removeK -1))

if __name__ == '__main__':
    main()