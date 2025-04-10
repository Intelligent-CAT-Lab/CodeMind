def test(self):
        self.registration_system = ClassRegistrationSystem()
        student1 = {"name": "John", "major": "Computer Science"}
        self.registration_system.register_student(student1)
        return self.registration_system.register_student(student1)