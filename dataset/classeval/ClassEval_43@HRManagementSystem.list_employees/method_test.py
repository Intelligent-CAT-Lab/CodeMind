def test(self):

        hr_system = HRManagementSystem()
        hr_system.employees = {1: {'name': 'John', 'position': 'Manager', 'department': 'Sales', 'salary': 100000}, 2: {'name': 'Jane', 'position': 'Manager', 'department': 'Sales', 'salary': 100000}}
        hr_system.employees = {1: {'name': 'John', 'position': 'Manager', 'department': 'Sales', 'salary': 100000}}
        return hr_system.list_employees(),hr_system.list_employees()