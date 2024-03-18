question = input().strip()
original_question = question[:-1].strip()
last_character = original_question[-1].upper()
vowels = ["A", "E", "I", "O", "U", "Y"]
result = "YES" if last_character in vowels else "NO"
print(result)