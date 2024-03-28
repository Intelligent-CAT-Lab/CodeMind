import java.util.ArrayList
import java.util.List
import java.util.Scanner

def main():
    sc = Scanner(System.in)
    list = ArrayList()
    x = sc.nextLong()

    while x > 0:
        r = x % 10
        if 9 - r < r:
            if x / 10 == 0 and 9 - r == 0:
                list.add(r)
            else:
                list.add(9 - r)
        else:
            list.add(r)
        x = x // 10

    pow = 0
    newNumber = 0

    for i in range(list.size()):
        newNumber = newNumber + list.get(i) * (10 ** pow)
        pow += 1

    System.out.println(newNumber)

if __name__ == '__main__':
    main()