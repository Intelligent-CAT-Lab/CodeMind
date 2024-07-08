import java.util.*;

public class Main {

	char[][] map = new char[][]{
		{'.','.','r','r','.','.','.','.'},
		{'.','.','r','r','.','.','.','.'},
		{'g','g','y','y','b','b','w','w'},
		{'g','g','y','y','b','b','w','w'},
		{'.','.','o','o','.','.','.','.'},
		{'.','.','o','o','.','.','.','.'},	
	};
	
	char tempA, tempB;
	
	void rotate90(int y, int x){
		tempA = map[y][x];
		map[y][x] = map[y+1][x];
		map[y+1][x] = map[y+1][x+1];
		map[y+1][x+1] = map[y][x+1];
		map[y][x+1] = tempA;
	}

	void solve(){
		Scanner sc = new Scanner(System.in);
		
var newVariable_0 = sc.hasNext();		while(newVariable_0){
			String s = sc.next();
			
var newVariable_1 = s.length();			for(int i=0;i<newVariable_1;i++){
				//U
var newVariable_2 = s.codePointAt(i);				if(newVariable_2==85){
					tempA = map[2][0];
					tempB = map[2][1];
					for(int j=0;j<6;j++) map[2][j] = map[2][j+2];
					map[2][6] = tempA;
					map[2][7] = tempB;
					rotate90(0,2);
				}
				//D
var newVariable_3 = s.codePointAt(i);				else if(newVariable_3==68){
					tempA = map[3][6];
					tempB = map[3][7];
					for(int j=0;j<6;j++) map[3][7-j] = map[3][5-j];
					map[3][0] = tempA;
					map[3][1] = tempB;
					rotate90(4,2);
				}
				//R
var newVariable_4 = s.codePointAt(i);				else if(newVariable_4==82){
					tempA = map[0][3];
					tempB = map[1][3];
					for(int j=0;j<4;j++) map[j][3] = map[j+2][3];
					map[4][3] = map[3][6];
					map[5][3] = map[2][6];
					map[3][6] = tempA;
					map[2][6] = tempB;
					rotate90(2,4);
				}
				//L
var newVariable_5 = s.codePointAt(i);				else if(newVariable_5==76){
					tempA = map[4][2];
					tempB = map[5][2];
					for(int j=0;j<4;j++) map[5-j][2] = map[3-j][2];
					map[0][2] = map[3][7];
					map[1][2] = map[2][7];
					map[3][7] = tempA;
					map[2][7] = tempB;
					rotate90(2,0);
				}
				//F
var newVariable_6 = s.codePointAt(i);				else if(newVariable_6==70){						
					tempA = map[1][2];
					tempB = map[1][3];
					map[1][2] = map[3][1];
					map[1][3] = map[2][1];
					map[3][1] = map[4][3];
					map[2][1] = map[4][2];
					map[4][3] = map[2][4];
					map[4][2] = map[3][4];
					map[2][4] = tempA;
					map[3][4] = tempB;			
					rotate90(2,2);
				}
				//B
var newVariable_7 = s.codePointAt(i);				else if(newVariable_7==66){						
					tempA = map[0][2];
					tempB = map[0][3];
					map[0][2] = map[2][5];
					map[0][3] = map[3][5];
					map[2][5] = map[5][3];
					map[3][5] = map[5][2];
					map[5][3] = map[3][0];
					map[5][2] = map[2][0];
					map[3][0] = tempA;
					map[2][0] = tempB;
					rotate90(2,6);
				}	
			}
			for(int k=0;k<6;k++){
				for(int j=0;j<8;j++){
					System.out.print(map[k][j]);
				}
				System.out.println();
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}