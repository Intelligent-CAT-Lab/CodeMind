import java.util.Scanner;

public class p01531:
    def __init__(self):
        self.in = [
            ["wa","nn","wo","",""],
            ["a","u","o","i","e"],
            ["ka","ku","ko","ki","ke"],
            ["sa","su","so","si","se"],
            ["ta","tu","to","ti","te"],
            ["na","nu","no","ni","ne"],
            ["ha","hu","ho","hi","he"],
            ["ma","mu","mo","mi","me"],
            ["ya","yu","yo","",""],
            ["ra","ru","ro","ri","re"]
        ]

    def run(self):
        scan = Scanner(System.in)
        while scan.hasNext():
            fl = scan.nextLine().toCharArray()
            for i in range(0, len(fl), 2):
                c = 0
                if fl[i+1] == 'T':
                    c = 0
                elif fl[i+1] == 'L':
                    c = 3
                elif fl[i+1] == 'U':
                    c = 1
                elif fl[i+1] == 'R':
                    c = 4
                elif fl[i+1] == 'D':
                    c = 2
                print(self.in[fl[i]-'0'][c], end='')
            print()

p01531().run()