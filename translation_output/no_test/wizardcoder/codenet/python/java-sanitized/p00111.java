public class p00111 {
    public static void main(String[] args) {
        String[] tableA = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," ",".","-","'","?","0","1","2","3","4","5","6","7","8","9"};
        String[] tableB = {" ","'",".",",","-","?","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] input = new Scanner(System.in).nextLine().split("");
        String output = "";
        for(int i=0;i<input.length;i++){
            output += tableA[Integer.parseInt(input[i])];
        }
        String tmp = "";
        for(int i=0;i<output.length();i++){
            tmp += output.charAt(i);
            if(tmp.length()>=3){
                for(int j=0;j<tableB.length;j++){
                    if(tmp.equals(tableB[j])){
                        output = output.substring(0,i-2) + tableB[j] + output.substring(i);
                        i -= 3;
                        break;
                    }
                }
                tmp = "";
            }
        }
        System.out.println(output);
    }
}