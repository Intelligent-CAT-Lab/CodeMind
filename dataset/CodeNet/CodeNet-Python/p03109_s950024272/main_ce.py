S = "2019/04/30"
year = int(S[:4])
month = int(S[5:7])
if year < 2019:
    print('Heisei')
elif month < 5:
    print('Heisei')
else:
    print('TBD')