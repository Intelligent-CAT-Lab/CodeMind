
class HRManagementSystem: 
    def __init__(self):
        """
        Initialize the HRManagementSystem withan attribute employees, which is an empty dictionary.
        """
        self.employees = {}

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