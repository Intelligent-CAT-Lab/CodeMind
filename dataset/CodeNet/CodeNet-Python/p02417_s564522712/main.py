import sys
s=sys.stdin.read().lower()
for i in range(97,123):
    print(chr(i),':',s.count(chr(i)))
