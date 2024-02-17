l1 = ["S001", "S002", "S003", "S004"]
l2 = ["Adina Park", "Leyton Marsh", "Duncan Boyle", "Saim Richards"]
l3 = [85, 98, 89, 92]

result = [{x: {y: z}} for (x, y, z) in zip(l1, l2, l3)]
print(result)