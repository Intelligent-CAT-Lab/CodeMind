import sys

def solve():
    n = int(input())
    perm = permutation_whose_number_of_increasing_sequence_is_k(n)
    print(len(perm)*2)
    for i in range(1, len(perm)+1):
        print(i, end=" ")
    print()
    for i in range(len(perm)):
        print(perm[i]+1, end=" ")
    print()

def permutation_whose_number_of_increasing_sequence_is_k(k):
    cur = (1<<(k+1))-1
    list = []
    for i in range(k+1):
        list.append(i)
    p = k+1