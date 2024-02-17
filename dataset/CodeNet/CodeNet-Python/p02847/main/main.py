from sys import stdin

a = stdin.readline().rstrip()

week = {'SUN':0,'MON':1,'TUE':2,'WED':3,'THU':4,'FRI':5,'SAT':6}

print((7-int(week.get(a))))