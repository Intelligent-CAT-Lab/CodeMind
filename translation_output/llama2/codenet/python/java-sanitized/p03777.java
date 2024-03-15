Solution


String a,b;
Scanner sc = new Scanner(System.in);
a = sc.nextLine();
b = sc.nextLine();

if(a.equals("H")){
  System.out.println(b);
}
else{
  if(b.equals("H")){
    System.out.println("D");
  }
  else{
    System.out.println("H");
  }
}