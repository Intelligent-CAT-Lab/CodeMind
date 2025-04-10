
class SignInSystem: 
    def __init__(self):
        """
        Initialize the sign-in system.
        """
        self.users = {}

    def check_sign_in(self, username):
        if username not in self.users:
            return False
        else:
            if self.users[username]:
                return True
            else:
                return False