class main:
    def p01531():
        in = [
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
        while True:
            fl = input().split()
            if len(fl) == 0:
                break
            for i in range(0, len(fl), 2):
                c = 0
                switch(fl[i+1]):
                    case 'T':
                        c = 0
                    case 'L':
                        c = 3
                    case 'U':
                        c = 1
                    case 'R':
                        c = 4
                    case 'D':
                        c = 2
                    default:
                        break
                print(in[fl[i]-'0'][c])
    
    if __name__ == "__main__":
        p01531()