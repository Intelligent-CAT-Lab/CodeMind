import java.util

def main():
    S = input()
    a = 0
    b = 0
    c = 0
    for i in range(len(S)):
        x = S[i]
        if x == 'a':
            a += 1
        if x == 'b':
            b += 1
        if x == 'c':
            c += 1
    if max(max(a, b), c) - min(min(a, b), c) <= 1:
        print('YES')
    else:
        print('NO')

if __name__ == '__main__':
    main()