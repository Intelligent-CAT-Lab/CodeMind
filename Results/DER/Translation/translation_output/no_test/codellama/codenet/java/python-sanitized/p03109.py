import sys

time = sys.stdin.readline().split()[5]

if time[0] == '1' or int(time[1]) > 4:
    print("TBD")
else:
    print("Heisei")