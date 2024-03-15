import math

def main():
    try:
        scanner = input()
        execute(scanner)
    except:
        pass

def execute(scanner):
    r = int(math.sqrt(scanner))
    print(r * r)

main()