def f(student_marks, name):
    if name in student_marks:
        value = student_marks.pop(name)
        return value
    return 'Name unknown'
f({'882afmfp': 56}, '6f53p')