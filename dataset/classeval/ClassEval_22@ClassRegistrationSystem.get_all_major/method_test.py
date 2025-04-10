def test(self):
        self.registration_system = ClassRegistrationSystem()
        self.registration_system.students = [{"name": "John", "major": "Computer Science"},
                                             {"name": "Bob", "major": "Computer Science"},
                                             {"name": "Alice", "major": "Mathematics"},
                                             {"name": "Tom", "major": "Mathematics"},
                                             {"name": "Jerry", "major": "Physics"}]

        majors = self.registration_system.get_all_major()

        return majors