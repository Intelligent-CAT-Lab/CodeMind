def p03109(date):
    time = date.split("/")[2]
    if time[0] == '1' or int(time[1]) > 4:
        return "TBD"
    else:
        return "Heisei"

print(p03109("2019/04/30"))