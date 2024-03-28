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
    for fl in input().split():
        c = 0
        for i in range(len(fl)):
            if fl[i] == 'T':
                c = 0
            elif fl[i] == 'L':
                c = 3
            elif fl[i] == 'U':
                c = 1
            elif fl[i] == 'R':
                c = 4
            else:
                break
        print(in[fl[0]-'0'][c])

p01531()