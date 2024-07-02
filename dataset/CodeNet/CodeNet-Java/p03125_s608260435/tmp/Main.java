class Main {
  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    int A = sc.nextInt();
System.out.println("[INST]3;A;sc.nextInt();"+A);
    int B = sc.nextInt();
System.out.println("[INST]4;B;sc.nextInt();"+B);
    if (B % A == 0)
      println(B + A);
    else
      println(B - A);
  }

  /* 以下、標準出力用関数 */
  static public void print(byte what) { System.out.print(what); System.out.flush(); }
System.out.println("[INST]12;None;System.out.flush();"+System.out.flush());
  static public void print(boolean what) { System.out.print(what); System.out.flush(); }
System.out.println("[INST]13;None;System.out.flush();"+System.out.flush());
  static public void print(char what) { System.out.print(what); System.out.flush(); }
System.out.println("[INST]14;None;System.out.flush();"+System.out.flush());
  static public void print(int what) { System.out.print(what); System.out.flush(); }
System.out.println("[INST]15;None;System.out.flush();"+System.out.flush());
  static public void print(long what) { System.out.print(what); System.out.flush(); }
System.out.println("[INST]16;None;System.out.flush();"+System.out.flush());
  static public void print(float what) { System.out.print(what); System.out.flush(); }
System.out.println("[INST]17;None;System.out.flush();"+System.out.flush());
  static public void print(double what) { System.out.print(what); System.out.flush(); }
System.out.println("[INST]18;None;System.out.flush();"+System.out.flush());
  static public void print(String what) { System.out.print(what); System.out.flush(); }
System.out.println("[INST]19;None;System.out.flush();"+System.out.flush());
  static public void print(Object... variables) { StringBuilder sb = new StringBuilder(); for (Object o : variables) { if (sb.length() != 0) { sb.append(" "); } if (o == null) { sb.append("null"); } else { sb.append(o.toString()); } } System.out.print(sb.toString()); }
System.out.println("[INST]20;None;sb.length();"+sb.length());
System.out.println("[INST]20;None;sb.append(' ');"+sb.append(" "));
System.out.println("[INST]20;None;sb.append('null');"+sb.append("null"));
System.out.println("[INST]20;None;sb.append(o.toString());"+sb.append(o.toString()));
System.out.println("[INST]20;None;o.toString();"+o.toString());
  static public void println() { System.out.println(); }
  static public void println(byte what) { System.out.println(what); System.out.flush(); }
System.out.println("[INST]22;None;System.out.flush();"+System.out.flush());
  static public void println(boolean what) { System.out.println(what); System.out.flush(); }
System.out.println("[INST]23;None;System.out.flush();"+System.out.flush());
  static public void println(char what) { System.out.println(what); System.out.flush(); }
System.out.println("[INST]24;None;System.out.flush();"+System.out.flush());
  static public void println(int what) { System.out.println(what); System.out.flush(); }
System.out.println("[INST]25;None;System.out.flush();"+System.out.flush());
  static public void println(long what) { System.out.println(what); System.out.flush(); }
System.out.println("[INST]26;None;System.out.flush();"+System.out.flush());
  static public void println(float what) { System.out.println(what); System.out.flush(); }
System.out.println("[INST]27;None;System.out.flush();"+System.out.flush());
  static public void println(double what) { System.out.println(what); System.out.flush(); }
System.out.println("[INST]28;None;System.out.flush();"+System.out.flush());
  static public void println(String what) { System.out.println(what); System.out.flush(); }
System.out.println("[INST]29;None;System.out.flush();"+System.out.flush());
  static public void println(Object... variables) { print(variables); println(); }
  static public void println(Object what) { if (what == null) { System.out.println("null"); } else if (what.getClass().isArray()) { printArray(what); } else { System.out.println(what.toString()); System.out.flush(); } }
System.out.println("[INST]31;None;what.getClass().isArray();"+what.getClass().isArray());
System.out.println("[INST]31;None;what.getClass();"+what.getClass());
System.out.println("[INST]31;None;System.out.flush();"+System.out.flush());
  static public void printArray(Object what) { if (what == null) { System.out.println("null"); } else { String name = what.getClass().getName(); if (name.charAt(0) == '[') { switch (name.charAt(1)) { case '[': System.out.println(what); break; case 'L': Object poo[] = (Object[]) what; for (int i = 0; i < poo.length; i++) { if (poo[i] instanceof String) { System.out.println("[" + i + "] \"" + poo[i] + "\""); } else { System.out.println("[" + i + "] " + poo[i]); } } break; case 'Z': boolean zz[] = (boolean[]) what; for (int i = 0; i < zz.length; i++) { System.out.println("[" + i + "] " + zz[i]); } break; case 'B': byte bb[] = (byte[]) what; for (int i = 0; i < bb.length; i++) { System.out.println("[" + i + "] " + bb[i]); } break; case 'C': char cc[] = (char[]) what; for (int i = 0; i < cc.length; i++) { System.out.println("[" + i + "] '" + cc[i] + "'"); } break; case 'I': int ii[] = (int[]) what; for (int i = 0; i < ii.length; i++) { System.out.println("[" + i + "] " + ii[i]); } break; case 'J': long jj[] = (long[]) what; for (int i = 0; i < jj.length; i++) { System.out.println("[" + i + "] " + jj[i]); } break; case 'F': float ff[] = (float[]) what; for (int i = 0; i < ff.length; i++) { System.out.println("[" + i + "] " + ff[i]); } break; case 'D': double dd[] = (double[]) what; for (int i = 0; i < dd.length; i++) { System.out.println("[" + i + "] " + dd[i]); } break; default: System.out.println(what); } } else { System.out.println(what); } } System.out.flush(); }
System.out.println("[INST]32;name;what.getClass().getName();"+name);
System.out.println("[INST]32;None;what.getClass();"+what.getClass());
System.out.println("[INST]32;None;name.charAt(0);"+name.charAt(0));
System.out.println("[INST]32;None;name.charAt(1);"+name.charAt(1));
System.out.println("[INST]32;None;System.out.flush();"+System.out.flush());
}
