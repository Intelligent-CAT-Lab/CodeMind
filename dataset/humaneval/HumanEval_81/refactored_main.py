grades = [4.0, 3, 1.7, 2, 3.5]

letter_grade = []
for gpa in grades:
    if gpa == 4.0:
        letter_grade.append("A+")
    elif gpa > 3.7:
        letter_grade.append("A")
    elif gpa > 3.3:
        letter_grade.append("A-")
    elif gpa > 3.0:
        letter_grade.append("B+")
    elif gpa > 2.7:
        letter_grade.append("B")
    elif gpa > 2.3:
        letter_grade.append("B-")
    elif gpa > 2.0:
        letter_grade.append("C+")
    elif gpa > 1.7:
        letter_grade.append("C")
    elif gpa > 1.3:
        letter_grade.append("C-")
    elif gpa > 1.0:
        letter_grade.append("D+")
    elif gpa > 0.7:
        letter_grade.append("D")
    elif gpa > 0.0:
        letter_grade.append("D-")
    else:
        letter_grade.append("E")
print(letter_grade)