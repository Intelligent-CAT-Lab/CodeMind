import sys

def saori_hayami():
    hayami = sys.stdin.readline()
    saori = int(hayami)
    i = 1
    while True:
        if i*saori % 360 == 0:
            print(i)
            return
        i += 1

if __name__ == '__main__':
    saori_hayami()