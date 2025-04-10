def test(self):

        sender = EmailClient('sender@example.com', 100)
        receiver = EmailClient('receiver@example.com', 0)
        return sender.send_to(receiver, 'Hello', 10)