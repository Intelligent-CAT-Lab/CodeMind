import java.util.Scanner;

class p03192:

    @staticmethod
    def main(args):
        sc = Scanner(System.in)  # æå­ã®å
¥å
        string = sc.next()
        count = 0
        for i in range(string.length()):
            if string.charAt(i) == '2':
                count += 1
        print(count)

if __name__ == '__main__':
    p03192.main(None)