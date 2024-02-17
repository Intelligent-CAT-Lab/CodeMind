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
		
		while(sc.hasNext()){
			String s = sc.next();
			
			for(int i=0;i<s.length();i++){
				//U
				if(s.codePointAt(i)==85){
					tempA = map[2][0];
					tempB = map[2][1];
					for(int j=0;j<6;j++) map[2][j] = map[2][j+2];
					map[2][6] = tempA;
					map[2][7] = tempB;
					rotate90(0,2);
				}
				//D
				else if(s.codePointAt(i)==68){
					tempA = map[3][6];
					tempB = map[3][7];
					for(int j=0;j<6;j++) map[3][7-j] = map[3][5-j];
					map[3][0] = tempA;
					map[3][1] = tempB;
					rotate90(4,2);
				}
				//R
				else if(s.codePointAt(i)==82){
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
				else if(s.codePointAt(i)==76){
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
				else if(s.codePointAt(i)==70){						
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
				else if(s.codePointAt(i)==66){						
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