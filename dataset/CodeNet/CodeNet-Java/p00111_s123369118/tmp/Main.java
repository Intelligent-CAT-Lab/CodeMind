import java.util.*;

class Main {
  public static void main (String[] args) {
    Map<String, String> dec1 = new HashMap<String, String>();
    dec1.put("A", "00000");
System.out.println("[INST]5;None;dec1.put('A', '00000');"+dec1.put("A", "00000"));
    dec1.put("B", "00001");
System.out.println("[INST]6;None;dec1.put('B', '00001');"+dec1.put("B", "00001"));
    dec1.put("C", "00010");
System.out.println("[INST]7;None;dec1.put('C', '00010');"+dec1.put("C", "00010"));
    dec1.put("D", "00011");
System.out.println("[INST]8;None;dec1.put('D', '00011');"+dec1.put("D", "00011"));
    dec1.put("E", "00100");
System.out.println("[INST]9;None;dec1.put('E', '00100');"+dec1.put("E", "00100"));
    dec1.put("F", "00101");
System.out.println("[INST]10;None;dec1.put('F', '00101');"+dec1.put("F", "00101"));
    dec1.put("G", "00110");
System.out.println("[INST]11;None;dec1.put('G', '00110');"+dec1.put("G", "00110"));
    dec1.put("H", "00111");
System.out.println("[INST]12;None;dec1.put('H', '00111');"+dec1.put("H", "00111"));
    dec1.put("I", "01000");
System.out.println("[INST]13;None;dec1.put('I', '01000');"+dec1.put("I", "01000"));
    dec1.put("J", "01001");
System.out.println("[INST]14;None;dec1.put('J', '01001');"+dec1.put("J", "01001"));
    dec1.put("K", "01010");
System.out.println("[INST]15;None;dec1.put('K', '01010');"+dec1.put("K", "01010"));
    dec1.put("L", "01011");
System.out.println("[INST]16;None;dec1.put('L', '01011');"+dec1.put("L", "01011"));
    dec1.put("M", "01100");
System.out.println("[INST]17;None;dec1.put('M', '01100');"+dec1.put("M", "01100"));
    dec1.put("N", "01101");
System.out.println("[INST]18;None;dec1.put('N', '01101');"+dec1.put("N", "01101"));
    dec1.put("O", "01110");
System.out.println("[INST]19;None;dec1.put('O', '01110');"+dec1.put("O", "01110"));
    dec1.put("P", "01111");
System.out.println("[INST]20;None;dec1.put('P', '01111');"+dec1.put("P", "01111"));
    dec1.put("Q", "10000");
System.out.println("[INST]21;None;dec1.put('Q', '10000');"+dec1.put("Q", "10000"));
    dec1.put("R", "10001");
System.out.println("[INST]22;None;dec1.put('R', '10001');"+dec1.put("R", "10001"));
    dec1.put("S", "10010");
System.out.println("[INST]23;None;dec1.put('S', '10010');"+dec1.put("S", "10010"));
    dec1.put("T", "10011");
System.out.println("[INST]24;None;dec1.put('T', '10011');"+dec1.put("T", "10011"));
    dec1.put("U", "10100");
System.out.println("[INST]25;None;dec1.put('U', '10100');"+dec1.put("U", "10100"));
    dec1.put("V", "10101");
System.out.println("[INST]26;None;dec1.put('V', '10101');"+dec1.put("V", "10101"));
    dec1.put("W", "10110");
System.out.println("[INST]27;None;dec1.put('W', '10110');"+dec1.put("W", "10110"));
    dec1.put("X", "10111");
System.out.println("[INST]28;None;dec1.put('X', '10111');"+dec1.put("X", "10111"));
    dec1.put("Y", "11000");
System.out.println("[INST]29;None;dec1.put('Y', '11000');"+dec1.put("Y", "11000"));
    dec1.put("Z", "11001");
System.out.println("[INST]30;None;dec1.put('Z', '11001');"+dec1.put("Z", "11001"));
    dec1.put(" ", "11010");
System.out.println("[INST]31;None;dec1.put(' ', '11010');"+dec1.put(" ", "11010"));
    dec1.put(".", "11011");
System.out.println("[INST]32;None;dec1.put('.', '11011');"+dec1.put(".", "11011"));
    dec1.put(",", "11100");
System.out.println("[INST]33;None;dec1.put(',', '11100');"+dec1.put(",", "11100"));
    dec1.put("-", "11101");
System.out.println("[INST]34;None;dec1.put('-', '11101');"+dec1.put("-", "11101"));
    dec1.put("'", "11110");
System.out.println("[INST]35;None;dec1.put(''', '11110');"+dec1.put("'", "11110"));
    dec1.put("?", "11111");
System.out.println("[INST]36;None;dec1.put('?', '11111');"+dec1.put("?", "11111"));
    Map <String, String> dec2 = new HashMap<String, String>();
    dec2.put("101", " ");
System.out.println("[INST]38;None;dec2.put('101', ' ');"+dec2.put("101", " "));
    dec2.put("000000", "'");
System.out.println("[INST]39;None;dec2.put('000000', ''');"+dec2.put("000000", "'"));
    dec2.put("000011", ",");
System.out.println("[INST]40;None;dec2.put('000011', ',');"+dec2.put("000011", ","));
    dec2.put("10010001", "-");
System.out.println("[INST]41;None;dec2.put('10010001', '-');"+dec2.put("10010001", "-"));
    dec2.put("010001", ".");
System.out.println("[INST]42;None;dec2.put('010001', '.');"+dec2.put("010001", "."));
    dec2.put("000001", "?");
System.out.println("[INST]43;None;dec2.put('000001', '?');"+dec2.put("000001", "?"));
    dec2.put("100101", "A");
System.out.println("[INST]44;None;dec2.put('100101', 'A');"+dec2.put("100101", "A"));
    dec2.put("10011010", "B");
System.out.println("[INST]45;None;dec2.put('10011010', 'B');"+dec2.put("10011010", "B"));
    dec2.put("0101", "C");
System.out.println("[INST]46;None;dec2.put('0101', 'C');"+dec2.put("0101", "C"));
    dec2.put("0001", "D");
System.out.println("[INST]47;None;dec2.put('0001', 'D');"+dec2.put("0001", "D"));
    dec2.put("110", "E");
System.out.println("[INST]48;None;dec2.put('110', 'E');"+dec2.put("110", "E"));
    dec2.put("01001", "F");
System.out.println("[INST]49;None;dec2.put('01001', 'F');"+dec2.put("01001", "F"));
    dec2.put("10011011", "G");
System.out.println("[INST]50;None;dec2.put('10011011', 'G');"+dec2.put("10011011", "G"));
    dec2.put("010000", "H");
System.out.println("[INST]51;None;dec2.put('010000', 'H');"+dec2.put("010000", "H"));
    dec2.put("0111", "I");
System.out.println("[INST]52;None;dec2.put('0111', 'I');"+dec2.put("0111", "I"));
    dec2.put("10011000", "J");
System.out.println("[INST]53;None;dec2.put('10011000', 'J');"+dec2.put("10011000", "J"));
    dec2.put("0110", "K");
System.out.println("[INST]54;None;dec2.put('0110', 'K');"+dec2.put("0110", "K"));
    dec2.put("00100", "L");
System.out.println("[INST]55;None;dec2.put('00100', 'L');"+dec2.put("00100", "L"));
    dec2.put("10011001", "M");
System.out.println("[INST]56;None;dec2.put('10011001', 'M');"+dec2.put("10011001", "M"));
    dec2.put("10011110", "N");
System.out.println("[INST]57;None;dec2.put('10011110', 'N');"+dec2.put("10011110", "N"));
    dec2.put("00101", "O");
System.out.println("[INST]58;None;dec2.put('00101', 'O');"+dec2.put("00101", "O"));
    dec2.put("111", "P");
System.out.println("[INST]59;None;dec2.put('111', 'P');"+dec2.put("111", "P"));
    dec2.put("10011111", "Q");
System.out.println("[INST]60;None;dec2.put('10011111', 'Q');"+dec2.put("10011111", "Q"));
    dec2.put("1000", "R");
System.out.println("[INST]61;None;dec2.put('1000', 'R');"+dec2.put("1000", "R"));
    dec2.put("00110", "S");
System.out.println("[INST]62;None;dec2.put('00110', 'S');"+dec2.put("00110", "S"));
    dec2.put("00111", "T");
System.out.println("[INST]63;None;dec2.put('00111', 'T');"+dec2.put("00111", "T"));
    dec2.put("10011100", "U");
System.out.println("[INST]64;None;dec2.put('10011100', 'U');"+dec2.put("10011100", "U"));
    dec2.put("10011101", "V");
System.out.println("[INST]65;None;dec2.put('10011101', 'V');"+dec2.put("10011101", "V"));
    dec2.put("000010", "W");
System.out.println("[INST]66;None;dec2.put('000010', 'W');"+dec2.put("000010", "W"));
    dec2.put("10010010", "X");
System.out.println("[INST]67;None;dec2.put('10010010', 'X');"+dec2.put("10010010", "X"));
    dec2.put("10010011", "Y");
System.out.println("[INST]68;None;dec2.put('10010011', 'Y');"+dec2.put("10010011", "Y"));
    dec2.put("10010000", "Z");
System.out.println("[INST]69;None;dec2.put('10010000', 'Z');"+dec2.put("10010000", "Z"));
    Scanner scanner = new Scanner(System.in);
    String  out = "";
    while (scanner.hasNext()) {
System.out.println("[INST]72;None;scanner.hasNext();"+scanner.hasNext());
      String line = scanner.nextLine();
System.out.println("[INST]73;line;scanner.nextLine();"+line);
      String dec1Str = "";
      for (int ii = 0; ii < line.length(); ii++) {
System.out.println("[INST]75;None;line.length();"+line.length());
        dec1Str += dec1.get(line.substring(ii, ii + 1));
System.out.println("[INST]76;dec1Str;dec1.get(line.substring(ii, ii + 1));"+dec1Str);
System.out.println("[INST]76;None;line.substring(ii, ii + 1);"+line.substring(ii, ii + 1));
      }
      for (;;) {
        boolean flag = false;
        for (int ii = 3; ii < 9; ii++) {
          if (dec1Str.length() < ii) {
System.out.println("[INST]81;None;dec1Str.length();"+dec1Str.length());
            flag = false;
            break;
          }
          String key = dec1Str.substring(0, ii);
System.out.println("[INST]85;key;dec1Str.substring(0, ii);"+key);
          if (dec2.containsKey(key)) {
System.out.println("[INST]86;None;dec2.containsKey(key);"+dec2.containsKey(key));
            out += dec2.get(key);
System.out.println("[INST]87;out;dec2.get(key);"+out);
            dec1Str = dec1Str.substring(ii);
System.out.println("[INST]88;dec1Str;dec1Str.substring(ii);"+dec1Str);
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