import unittest
class AssessmentSystem:
    def __init__(self):
        self.students = {}

    def add_student(self, name, grade, major):
        self.students[name] = {'name': name, 'grade': grade, 'major': major, 'courses': {}}

    def add_course_score(self, name, course, score):
        if name in self.students:
            self.students[name]['courses'][course] = score

    def get_gpa(self, name):
        if name in self.students and self.students[name]['courses']:
            return sum(self.students[name]['courses'].values()) / len(self.students[name]['courses'])
        else:
            return None

    def get_all_students_with_fail_course(self):
        students = []
        for name, student in self.students.items():
            for course, score in student['courses'].items():
                if score < 60:
                    students.append(name)
                    break
        return students

    def get_course_average(self, course):
        total = 0
        count = 0
        for student in self.students.values():
            if course in student['courses']:
                score = student['courses'][course]
                if score is not None:
                    total += score
                    count += 1
        return total / count if count > 0 else None

    def get_top_student(self):
        top_student = None
        top_gpa = 0
        for name, student in self.students.items():
            gpa = self.get_gpa(name)
            if gpa is not None and gpa > top_gpa:
                top_gpa = gpa
                top_student = name
        return top_student
class Test(unittest.TestCase):
    def test(self):
            assessment_system = AssessmentSystem()
            assessment_system.students = {'Alice': {'name': 'Alice', 'grade': 3, 'major': 'Mathematics',
                                                    'courses': { }},
                                          'Bob': {'name': 'Bob', 'grade': 4, 'major': 'Physics',
                                                  'courses': {'Physics': 85}},
                                          'Charlie': {'name': 'Charlie', 'grade': 2, 'major': 'Chemistry',
                                                      'courses': {'Chemistry': 70, 'Physics': 80}}
                                          }
            return assessment_system.get_top_student()