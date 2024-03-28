# Welcome to online Python execution.
# Online Python execution is an online compiler and debugger tool for Python, Java, PHP, Ruby, Perl,
# C, C++, C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
# Write, Compile, Execute and Debug code online from anywhere in the world.

def main():
    a, b, op = map(int, input().split())

    for i in range(op):
        if i % 2 == 0:
            b += a // 2
            a //= 2
        else:
            a += b // 2
            b //= 2

    print(a)
    print(b)

if __name__ == '__main__':
    main()