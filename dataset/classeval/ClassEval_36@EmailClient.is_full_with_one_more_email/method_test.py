def test(self):

        sender = EmailClient('sender@example.com', 100)
        receiver = EmailClient('receiver@example.com', 20)
        return receiver.is_full_with_one_more_email(20)