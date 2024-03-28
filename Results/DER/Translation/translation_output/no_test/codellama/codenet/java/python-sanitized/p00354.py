import sys

days = "thu:fri:sat:sun:mon:tue:wed".split(":")

day = days[int(sys.stdin.readline()) % 7]

print(day)