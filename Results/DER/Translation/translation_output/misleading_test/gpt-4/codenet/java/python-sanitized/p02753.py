# author : Atul Anand
# created on : Tue Mar 31 2020

import sys

def main():
    S = input()
    if S[0] == S[1] and S[1] == S[2]:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()

# Sample test case
# Test input:
# ABA
#
# Expected output:
# |,s