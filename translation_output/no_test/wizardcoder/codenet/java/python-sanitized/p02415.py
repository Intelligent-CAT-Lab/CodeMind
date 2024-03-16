#8-A
import java.util.Scanner;

class p02415:
    def main(self):
        sc = Scanner(System.in)
        n = sc.nextLine()
        num = n.length()
        for i in range(num):
            if n.charAt(i).islower():
                System.out.print(chr(ord(n.charAt(i)).upper()))
            elif n.charAt(i).isupper():
                System.out.print(chr(ord(n.charAt(i)).lower()))
            #elif n.charAt(i) =='':
            #    System.out.print(' ')
            else:
                System.out.print(n.charAt(i))
        System.out.println()