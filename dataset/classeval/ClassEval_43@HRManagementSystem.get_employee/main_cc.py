
class HRManagementSystem: 
    def __init__(self):
        """
        Initialize the HRManagementSystem withan attribute employees, which is an empty dictionary.
        """
        self.employees = {}

    def get_employee(self, employee_id):
        if employee_id in self.employees:
            return self.employees[employee_id]
        else:
            return False