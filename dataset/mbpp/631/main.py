def replace_spaces(text):
  return "".join(" " if c == "_" else ("_" if c == " " else c) for c in text)