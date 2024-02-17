import java.util.*;

class Main {
  public static void main (String[] args) {
    Map<String, String> dec1 = new HashMap<String, String>();
    dec1.put("A", "00000");
    dec1.put("B", "00001");
    dec1.put("C", "00010");
    dec1.put("D", "00011");
    dec1.put("E", "00100");
    dec1.put("F", "00101");
    dec1.put("G", "00110");
    dec1.put("H", "00111");
    dec1.put("I", "01000");
    dec1.put("J", "01001");
    dec1.put("K", "01010");
    dec1.put("L", "01011");
    dec1.put("M", "01100");
    dec1.put("N", "01101");
    dec1.put("O", "01110");
    dec1.put("P", "01111");
    dec1.put("Q", "10000");
    dec1.put("R", "10001");
    dec1.put("S", "10010");
    dec1.put("T", "10011");
    dec1.put("U", "10100");
    dec1.put("V", "10101");
    dec1.put("W", "10110");
    dec1.put("X", "10111");
    dec1.put("Y", "11000");
    dec1.put("Z", "11001");
    dec1.put(" ", "11010");
    dec1.put(".", "11011");
    dec1.put(",", "11100");
    dec1.put("-", "11101");
    dec1.put("'", "11110");
    dec1.put("?", "11111");
    Map <String, String> dec2 = new HashMap<String, String>();
    dec2.put("101", " ");
    dec2.put("000000", "'");
    dec2.put("000011", ",");
    dec2.put("10010001", "-");
    dec2.put("010001", ".");
    dec2.put("000001", "?");
    dec2.put("100101", "A");
    dec2.put("10011010", "B");
    dec2.put("0101", "C");
    dec2.put("0001", "D");
    dec2.put("110", "E");
    dec2.put("01001", "F");
    dec2.put("10011011", "G");
    dec2.put("010000", "H");
    dec2.put("0111", "I");
    dec2.put("10011000", "J");
    dec2.put("0110", "K");
    dec2.put("00100", "L");
    dec2.put("10011001", "M");
    dec2.put("10011110", "N");
    dec2.put("00101", "O");
    dec2.put("111", "P");
    dec2.put("10011111", "Q");
    dec2.put("1000", "R");
    dec2.put("00110", "S");
    dec2.put("00111", "T");
    dec2.put("10011100", "U");
    dec2.put("10011101", "V");
    dec2.put("000010", "W");
    dec2.put("10010010", "X");
    dec2.put("10010011", "Y");
    dec2.put("10010000", "Z");
    Scanner scanner = new Scanner(System.in);
    String  out = "";
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      String dec1Str = "";
      for (int ii = 0; ii < line.length(); ii++) {
        dec1Str += dec1.get(line.substring(ii, ii + 1));
      }
      for (;;) {
        boolean flag = false;
        for (int ii = 3; ii < 9; ii++) {
          if (dec1Str.length() < ii) {
            flag = false;
            break;
          }
          String key = dec1Str.substring(0, ii);
          if (dec2.containsKey(key)) {
            out += dec2.get(key);
            dec1Str = dec1Str.substring(ii);
            flag = true;
            break;
          }
        }
        if (!flag) {
          break;
        }
      }
      out += "\n";
    }
    System.out.print(out);
  }
}