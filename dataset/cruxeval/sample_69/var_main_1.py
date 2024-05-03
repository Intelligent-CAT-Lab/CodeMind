def f(student_marks, name):
    if name in student_marks:	## name = CLRJ | student_marks = CLRJ
        value = student_marks.pop(name)
        return value
    return 'Name unknown'