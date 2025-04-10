import unittest
class ClassRegistrationSystem:

    def __init__(self):
        self.students = []
        self.students_registration_classes = {}

    def register_student(self, student):
        if student in self.students:
            return 0
        else:
            self.students.append(student)
            return 1

    def register_class(self, student_name, class_name):
        if student_name in self.students_registration_classes:
            self.students_registration_classes[student_name].append(class_name)
        else:
            self.students_registration_classes[student_name] = [class_name]
        return self.students_registration_classes[student_name]

    def get_students_by_major(self, major):
        student_list = []
        for student in self.students:
            if student["major"] == major:
                student_list.append(student["name"])
        return student_list

    def get_all_major(self):
        major_list = []
        for student in self.students:
            if student["major"] not in major_list:
                major_list.append(student["major"])
        return major_list

    def get_most_popular_class_in_major(self, major):
        class_list = []
        for student in self.students:
            if student["major"] == major:
                class_list += self.students_registration_classes[student["name"]]
        most_popular_class = max(set(class_list), key=class_list.count)
        return most_popular_class
class Test(unittest.TestCase):
    def test(self):
            self.registration_system = ClassRegistrationSystem()
            self.registration_system.students = [{"name": "John", "major": "Computer Science"},
                                                 {"name": "Bob", "major": "Computer Science"},
                                                 {"name": "Alice", "major": "Mathematics"},
                                                 {"name": "Tom", "major": "Mathematics"},
                                                 {"name": "Jerry", "major": "Physics"}]
            majors = self.registration_system.get_all_major()
            return majors