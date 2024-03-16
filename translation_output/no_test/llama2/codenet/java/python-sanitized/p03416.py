import java.util

class p03416:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        a = sc.nextInt()
        b = sc.nextInt()
        count = 0
        for i in range(a, b+1):
            array = [i % 10, i / 10 % 10, i / 100 % 10, i / 1000 % 10, i / 10000 % 10]
            if array[0] == array[4] and array[1] == array[3]:
                count += 1
        print(count)