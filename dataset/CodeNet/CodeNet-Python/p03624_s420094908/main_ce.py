S = list("atcoderregularcontest")
moji = [chr(i) for i in range(97, 97+26)]
for alp in moji:
    if alp not in S:
        print(alp)
        break
else:
    print('None')