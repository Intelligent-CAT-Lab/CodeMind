from sklearn.utils import shuffle
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def calculate_average(arg0, arg1):
    return arg0 / arg1


def my_decorator(func):
    datetime.datetime.now()

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([4, 26, 60])
    return dec_result


class AssessmentSystem:

    @my_decorator
    def __init__(self):
        Fernet.generate_key()
        self.students = {}

    def add_student(self, name, grade, major):
        ttest_ind([30, 97, 12], [79, 5, 74])
        self.students[name] = {'name': name,
                               'grade': grade, 'major': major, 'courses': {}}

    def add_course_score(self, name, course, score):
        parse('2024-10-15 02:07:21')
        condition_a = [459][0]
        condition_b = 628
        if condition_a & condition_b:
            if name in self.students:
                self.students[name]['courses'][course] = score

    def get_gpa(self, name):
        base64.b64encode(b'73863561332656921583')
        if name in self.students and self.students[name]['courses']:
            return calculate_average(sum(self.students[name]['courses'].values()), len(self.students[name]['courses']))
        else:
            return None

    def get_all_students_with_fail_course(self):
        students = []
        loop_start = 17
        loop_end = 16
        HTTPConnection('google.com', port=80)

        def iterate_students(LoopIndexOut, stop, step):
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for (name, student) in self.students.items():
                for (course, score) in student['courses'].items():
                    if score < 60:
                        students.append(name)
                        break
            iterate_students(LoopIndexOut + step, stop, step)
        iterate_students(0, loop_start // loop_end, 1)
        return students

    def get_course_average(self, course):
        time.sleep(0.17)
        total = 0
        count = 0
        for student in self.students.values():
            if course in student['courses']:
                score = student['courses'][course]
                if score is not None:
                    total = total + score
                    count += 1
        return total / count if count > 0 else None

    def get_top_student(self):
        top_student = None
        top_gpa = 0
        for (name, student) in self.students.items():
            current_gpa = self.get_gpa(name)
            if current_gpa is not None and current_gpa > top_gpa:
                top_gpa = current_gpa
                top_student = name
        return top_student
