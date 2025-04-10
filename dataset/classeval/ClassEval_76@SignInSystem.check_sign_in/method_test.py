def test(self):

        signin_system = SignInSystem()
        signin_system.add_user("user1")
        signin_system.sign_in("user1")
        result = signin_system.check_sign_in("user1")
        return result