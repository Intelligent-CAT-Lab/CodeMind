# Reading the input
h, w, a, b = map(int, input().split())

# Initialize the strings to store patterns
s1 = ""
s2 = ""

# Create the two patterns for the rows
for j in range(w):
    if j < a:
        s1 += "0"
        s2 += "1"
    else:
        s1 += "1"
        s2 += "0"

# Print the patterns for each row
for i in range(h):
    if i < b:
        print(s1)
    else:
        print(s2)