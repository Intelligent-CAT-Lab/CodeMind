public class p00111 {
    public static void main(String[] args) {
        String[] tableA = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," ",".","-","'","?","0","1","2","3","4","5","6","7","8","9"};
        String[] tableB = {" ",".","-","'","?","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String input = "?D-C'KOPUA";
        String output = "";
        String tmp = "";
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            int index = Arrays.asList(tableA).indexOf(c);
            if(index!=-1){
                tmp+=tableA[index];
            }
            if(tmp.length()==6){
                int index2 = Arrays.asList(tableB).indexOf(tmp);
                if(index2!=-1){
                    output+=tableB[index2];
                }
                tmp = "";
            }
        }
        System.out.println(output);
    }
}