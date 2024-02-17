needle = 'a'
haystack = 'xxxaaxaaxx'
count = 0
while needle in haystack:
    haystack = haystack.replace(needle, '', 1)
    count += 1
print(count)