def test(self):

        hr_system = HRManagementSystem()
        hr_system.employees = {}
        return hr_system.update_employee(1, {'name': 'John', 'position': 'Manager', 'department': 'Sales', 'salary': 20000}),hr_system.employees