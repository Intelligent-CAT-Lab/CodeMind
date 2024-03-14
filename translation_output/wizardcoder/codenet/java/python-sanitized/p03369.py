import java.util.Scanner

class p03369:
    scanner = Scanner(System.in)

    def main(args):
        s = gs()
        print((s.length() - s.replace("o", "").length()) * 100 + 700)

    def gs():
        return scanner.next()

    def gi():
        return int(scanner.next())

    def gl():
        return long(scanner.next())

    def gd():
        return float(scanner.next())

p03369().main(None)