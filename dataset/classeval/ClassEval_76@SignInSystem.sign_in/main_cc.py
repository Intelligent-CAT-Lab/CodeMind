
class SignInSystem: 
    def __init__(self):
        """
        Initialize the sign-in system.
        """
        self.users = {}

    def sign_in(self, username):
        if username not in self.users:
            return False
        else:
            self.users[username] = True
            return True