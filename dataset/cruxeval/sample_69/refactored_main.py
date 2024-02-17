student_marks = {'882afmfp': 56}
name = '6f53p'
if name in student_marks:
    value = student_marks.pop(name)
    print(value)
else:
    print('Name unknown')