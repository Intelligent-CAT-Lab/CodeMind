def test(self):

        ss = SplitSentence()
        cnt = ss.process_text_file("Mr. Smith is a teacher. Yes 1 2 3 4 5 6.")
        return cnt