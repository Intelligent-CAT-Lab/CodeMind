# Get the input string from the user
s = input()

# Check if the input string ends with "s"
if s.endswith("s"):
    # Append "es" to the end of the string
    print(s + "es")
else:
    # Append "s" to the end of the string
    print(s + "s")