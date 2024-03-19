def codeforces_49_A(question):
    originalQ = question[:-1].strip()
    ch = question[-1]
    vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
    b = any(e.lower() == ch.lower() for e in vowels)
    return "YES" if b else "NO"

# Test input
print(codeforces_49_A("BueDOlxgzeNlxrzRrMbKiQdmGujEKmGxclvaPpTuHmTqBp?"))