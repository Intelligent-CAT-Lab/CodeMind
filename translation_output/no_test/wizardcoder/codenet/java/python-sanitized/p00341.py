import java.util.Collections
import java.util.LinkedList
import java.util.Scanner

def main():
    sc = Scanner(System.in)
    e = LinkedList()
    each = 0
    disinct = None

    for i in range(12):
        e.add(sc.nextInt())

    if e.stream().distinct().count() > 3:
        print("no")
        return

    Collections.sort(e)
    disinct = e.stream().distinct().toArray()
    for a in disinct:
        each = e.stream().filter(i -> i == a).count()
        if each!= 4 and each!= 8 and each!= 12:
            print("no")
            return

    print("yes")

if __name__ == '__main__':
    main()