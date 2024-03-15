# In Python, we don't need to import a Scanner as we have built-in input() function
def p02576():
    n = int(input())  # Input for n
    x = int(input())  # Input for x
    t = int(input())  # Input for t
    ans = 0
    tako = 0
    while n > tako:
        ans += t
        tako += x
    print(ans)

# If you wish to run the function when the script is executed, uncomment the next line:
# p02576()