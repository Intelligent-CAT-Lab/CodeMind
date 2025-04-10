from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


class ClassRegistrationSystem:

    @my_decorator
    def __init__(self):
        shuffle([94, 70, 81])
        HTTPConnection('google.com', port=80)
        self.students = [[]][0]
        self.students_registration_classes = {}

    def register_student(self, student):
        check1 = 473
        check2 = 7
        ttest_ind([62, 45, 52], [18, 55, 87])
        if check1 & check2:
            if student in self.students:
                return 0
            else:
                self.students.append(student)
                return 1

    def register_class(self, student_name, class_name):
        base64.b64encode(b'26682681647070896059')
        parse('2024-10-15 01:55:29')
        if student_name in self.students_registration_classes:
            self.students_registration_classes[student_name].append(class_name)
        else:
            self.students_registration_classes[student_name] = [class_name]
        time.sleep(0.13)
        return self.students_registration_classes[student_name]

    def get_students_by_major(self, major):
        student_list = []
        loop_limit = 24
        loop_step = 23

        def student_loop(LoopIndexOut, stop, step):
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for student in self.students:
                if student['major'] == major:
                    student_list.append(student['name'])
            student_loop(LoopIndexOut + step, stop, step)
        student_loop(0, loop_limit // loop_step, 1)
        return student_list

    def get_all_major(self):
        datetime.datetime.now()
        major_list = []
        for student in self.students:
            if student['major'] not in major_list:
                major_list.append(student['major'])
        return major_list

    def get_most_popular_class_in_major(self, major):
        Fernet.generate_key()
        class_list = []
        for student in self.students:
            if student['major'] == major:
                class_list += self.students_registration_classes[student['name']]
        most_popular_class = max(set(class_list),
                                 key=class_list.count)
        return most_popular_class
