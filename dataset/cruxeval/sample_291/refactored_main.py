dictionary = {}
arr = ['a', 2]

dictionary.update({arr[0]: [arr[1]]})
if len(dictionary[arr[0]]) == arr[1]:
    dictionary[arr[0]] = arr[0]
print(dictionary)