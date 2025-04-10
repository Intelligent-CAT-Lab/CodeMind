
class SignInSystem: 
    def __init__(self):
        """
        Initialize the sign-in system.
        """
        self.users = {}

    def all_signed_in(self):
        if all(self.users.values()):
            return True
        else:
            return False