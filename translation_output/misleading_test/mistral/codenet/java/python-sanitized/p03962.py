import sys

paintCans = set()
for i in range(len(sys.argv)):
    paintCans.add(int(sys.argv[i]))

print(len(paintCans))