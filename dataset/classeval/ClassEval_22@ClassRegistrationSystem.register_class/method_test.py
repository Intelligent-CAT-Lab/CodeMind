def test(self):
        self.registration_system = ClassRegistrationSystem()

        return self.registration_system.register_class(student_name='John', class_name='CS101')