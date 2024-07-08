import java.util.*;

class Main {
  public static void main (String[] args) {
    Map<String, String> dec1 = new HashMap<String, String>();
var newVariable_0 = dec1.put("A", "00000");var newVariable_1 = dec1.put("B", "00001");var newVariable_2 = dec1.put("C", "00010");var newVariable_3 = dec1.put("D", "00011");var newVariable_4 = dec1.put("E", "00100");var newVariable_5 = dec1.put("F", "00101");var newVariable_6 = dec1.put("G", "00110");var newVariable_7 = dec1.put("H", "00111");var newVariable_8 = dec1.put("I", "01000");var newVariable_9 = dec1.put("J", "01001");var newVariable_10 = dec1.put("K", "01010");var newVariable_11 = dec1.put("L", "01011");var newVariable_12 = dec1.put("M", "01100");var newVariable_13 = dec1.put("N", "01101");var newVariable_14 = dec1.put("O", "01110");var newVariable_15 = dec1.put("P", "01111");var newVariable_16 = dec1.put("Q", "10000");var newVariable_17 = dec1.put("R", "10001");var newVariable_18 = dec1.put("S", "10010");var newVariable_19 = dec1.put("T", "10011");var newVariable_20 = dec1.put("U", "10100");var newVariable_21 = dec1.put("V", "10101");var newVariable_22 = dec1.put("W", "10110");var newVariable_23 = dec1.put("X", "10111");var newVariable_24 = dec1.put("Y", "11000");var newVariable_25 = dec1.put("Z", "11001");var newVariable_26 = dec1.put(" ", "11010");var newVariable_27 = dec1.put(".", "11011");var newVariable_28 = dec1.put(",", "11100");var newVariable_29 = dec1.put("-", "11101");var newVariable_30 = dec1.put("'", "11110");var newVariable_31 = dec1.put("?", "11111");    Map <String, String> dec2 = new HashMap<String, String>();
var newVariable_32 = dec2.put("101", " ");var newVariable_33 = dec2.put("000000", "'");var newVariable_34 = dec2.put("000011", ",");var newVariable_35 = dec2.put("10010001", "-");var newVariable_36 = dec2.put("010001", ".");var newVariable_37 = dec2.put("000001", "?");var newVariable_38 = dec2.put("100101", "A");var newVariable_39 = dec2.put("10011010", "B");var newVariable_40 = dec2.put("0101", "C");var newVariable_41 = dec2.put("0001", "D");var newVariable_42 = dec2.put("110", "E");var newVariable_43 = dec2.put("01001", "F");var newVariable_44 = dec2.put("10011011", "G");var newVariable_45 = dec2.put("010000", "H");var newVariable_46 = dec2.put("0111", "I");var newVariable_47 = dec2.put("10011000", "J");var newVariable_48 = dec2.put("0110", "K");var newVariable_49 = dec2.put("00100", "L");var newVariable_50 = dec2.put("10011001", "M");var newVariable_51 = dec2.put("10011110", "N");var newVariable_52 = dec2.put("00101", "O");var newVariable_53 = dec2.put("111", "P");var newVariable_54 = dec2.put("10011111", "Q");var newVariable_55 = dec2.put("1000", "R");var newVariable_56 = dec2.put("00110", "S");var newVariable_57 = dec2.put("00111", "T");var newVariable_58 = dec2.put("10011100", "U");var newVariable_59 = dec2.put("10011101", "V");var newVariable_60 = dec2.put("000010", "W");var newVariable_61 = dec2.put("10010010", "X");var newVariable_62 = dec2.put("10010011", "Y");var newVariable_63 = dec2.put("10010000", "Z");    Scanner scanner = new Scanner(System.in);
    String  out = "";
var newVariable_64 = scanner.hasNext();    while (newVariable_64) {
      String line = scanner.nextLine();
      String dec1Str = "";
var newVariable_65 = line.length();      for (int ii = 0; ii < newVariable_65; ii++) {
var newVariable_66 = line.substring(ii, ii + 1);        dec1Str += dec1.get(newVariable_66);
      }
      for (;;) {
        boolean flag = false;
        for (int ii = 3; ii < 9; ii++) {
var newVariable_67 = dec1Str.length();          if (newVariable_67 < ii) {
            flag = false;
            break;
          }
          String key = dec1Str.substring(0, ii);
var newVariable_68 = dec2.containsKey(key);          if (newVariable_68) {
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