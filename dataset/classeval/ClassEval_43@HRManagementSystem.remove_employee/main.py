import unittest
class HRManagementSystem:
    def __init__(self):
        self.employees = {}

    def add_employee(self, employee_id, name, position, department, salary):
        if employee_id in self.employees:
            return False
        else:
            self.employees[employee_id] = {
                'name': name,
                'position': position,
                'department': department,
                'salary': salary
            }
            return True

    def remove_employee(self, employee_id):
        if employee_id in self.employees:
            del self.employees[employee_id]
            return True
        else:
            return False

    def update_employee(self, employee_id: int, employee_info: dict):
        employee = self.get_employee(employee_id)
        if employee == False:
            return False
        else:
            for key, value in employee_info.items():
                if key not in employee:
                    return False
            for key, value in employee_info.items():
                employee[key] = value
            return True

    def get_employee(self, employee_id):
        if employee_id in self.employees:
            return self.employees[employee_id]
        else:
            return False

    def list_employees(self):
        employee_data = {}
        if self.employees:
            for employee_id, employee_info in self.employees.items():
                employee_details = {}
                employee_details["employee_ID"] = employee_id
                for key, value in employee_info.items():
                    employee_details[key] = value
                employee_data[employee_id] = employee_details
        return employee_data
class Test(unittest.TestCase):
    def test(self):
            hr_system = HRManagementSystem()
            hr_system.employees = {1: {'name': 'John', 'position': 'Manager', 'department': 'Sales', 'salary': 100000}}
            return hr_system.remove_employee(1),hr_system.employees