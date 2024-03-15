import java.util.LinkedList
import java.util.Scanner

def main():
    sc = Scanner(System.in)
    e = LinkedList()
    each = 0
    distinct = []

    for i in range(12):
        e.append(sc.nextInt())

    if len(set(e)) > 3:
        print("no")
        return

    e.sort()
    distinct = list(set(e))
    for a in distinct:
        each = e.count(a)
        if each != 4 and each != 8 and each != 12:
            print("no")
            return

    print("yes")

if __name__ == "__main__":
    main()