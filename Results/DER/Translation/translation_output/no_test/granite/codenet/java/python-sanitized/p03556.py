import math

def execute(scanner):
    r = int(math.sqrt(scanner.nextInt()))
    print(r * r)

with Scanner(System.in) as scanner:
    execute(scanner)