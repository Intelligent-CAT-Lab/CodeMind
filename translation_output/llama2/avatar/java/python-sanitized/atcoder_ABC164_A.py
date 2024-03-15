import java.util

class atcoder_ABC164_A:
    def main(self, args):
        scanner = java.util.Scanner(sys.stdin)
        list = []

        list.append(scanner.nextLine())

        numlist = list[0].split(" ")
        sheep = int(numlist[0])
        wolf = int(numlist[1])

        if wolf >= sheep:
            print("unsafe")
        else:
            print("safe")