import math

def execute(scanner):
    r = int(math.sqrt(scanner.nextInt()))
    print(r * r)

if __name__ == '__main__':
    with open('input.txt', 'r') as f:
        scanner = Scanner(f)
        execute(scanner)