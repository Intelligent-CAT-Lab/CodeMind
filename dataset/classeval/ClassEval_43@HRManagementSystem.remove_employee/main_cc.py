
class HRManagementSystem: 
    def __init__(self):
        """
        Initialize the HRManagementSystem withan attribute employees, which is an empty dictionary.
        """
        self.employees = {}

    def remove_employee(self, employee_id):
        if employee_id in self.employees:
            del self.employees[employee_id]
            return True
        else:
            return False