import java.util.Scanner;

class p03192:
    def main(self):
        sc = Scanner(System.in)
        string = sc.next()
        count = 0
        for i in range(len(string)):
            if string[i] == '2':
                count += 1
        print(count)