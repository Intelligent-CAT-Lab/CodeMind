import re


class SplitSentence:

    def split_sentences(self, sentences_string):
        sentences = re.split(r'(?<!\w\.\w.)(?<![A-Z][a-z]\.)(?<=\.|\?)\s', sentences_string)
        return sentences

    def count_words(self, sentence):
        sentence = re.sub(r'[^a-zA-Z\s]', '', sentence)
        words = sentence.split()
        return len(words)

    def process_text_file(self, sentences_string):
        sentences = self.split_sentences(sentences_string)
        max_count = 0
        for sentence in sentences:
            count = self.count_words(sentence)
            if count > max_count:
                max_count = count

        return max_count