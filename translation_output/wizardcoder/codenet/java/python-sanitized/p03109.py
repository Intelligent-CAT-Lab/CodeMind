import java.util.Scanner;

class p03109:
    def main(self):
        scn = Scanner(System.in)
        time = scn.next().substring(5)
        if time.charAt(0) == '1' or Character.getNumericValue(time.charAt(1)) > 4:
            print("TBD")
        else:
            print("Heisei")

p03109().main()