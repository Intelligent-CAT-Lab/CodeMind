import sys

time = sys.stdin.readline().strip()[-2:]

if time[0] == '1' or int(time[1]) > 4:
    print("TBD")
else:
    print("Heisei")