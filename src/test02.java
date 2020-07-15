
public class test02 {

	public static void main(String[] args) {
		char[][] map = new char[11][11];
		
		int x, y = 0;
		int redix = 10;
		
		for(int i=0; i <map.length; i++) {
			//map[i][0]  = (char)(i + '0');
			
			//map[i][0] = Character.forDigit(i, redix);
			System.out.printf("%4d",i);
			
			for(int j=1; j<map[i].length; j++) {
				//map[0][j] = (char)(j+'0');
				map[0][j] = Character.forDigit(j, redix);
				
				
				x = (int)(Math.random()*10)+1;
				y = (int)(Math.random()*10)+1;
				map[x][y] = 'X'; 
				
				System.out.printf("%4c", map[i][j]);
				//System.out.printf("%4c",map[0][j]);
			}
			
			System.out.println();
		}

	}

}
