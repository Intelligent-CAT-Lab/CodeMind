import sys

for i in range(3):
    sys.stdout.write(chr(ord(sys.stdin.read(1)) - 32).upper())
    sys.stdout.write(' ')