string = 'jerry'

if not string:
    print('')

beginning_of_suffix = 0

while not is_palindrome(string[beginning_of_suffix:]):
    beginning_of_suffix += 1

print(string + string[:beginning_of_suffix][::-1])