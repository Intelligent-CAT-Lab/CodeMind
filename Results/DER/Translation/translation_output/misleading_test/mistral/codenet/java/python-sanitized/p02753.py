# Sample test case
S = "ABA"

# Expected output
print("|,s")

# Python implementation
def p02753():
    S = input()
    if S[0] == S[1] and S[1] == S[2]:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    p02753()