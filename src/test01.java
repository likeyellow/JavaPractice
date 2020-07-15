
public class test01 {

	public static void main(String[] args) {
		int[][] basic = new int[10][10];
		int x, y = 0;
		
		for(int i=0; i <basic.length; i++) {
			for(int j=0; j<basic[i].length; j++) {
				basic[i][j] = i *basic.length + j + 1;
				System.out.printf("%4d",basic[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("===========================================");
		for(int i=0; i < 10; i++) {
			for(int j=0; j<10; j++) {
				x = (int)(Math.random()*10);
				y = (int)(Math.random()*10);
				
				int tmp = basic[i][j];
				basic[i][j] = basic[x][y];
				basic[x][y] = tmp;
				
				System.out.printf("%4d", basic[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("===========================================");
		
		for(int i=0; i < 10; i++) {
			for(int j=0; j < 10; j++) {
				x = (int)(Math.random()*10);
				y = (int)(Math.random()*10);
				
				int tmp = basic[i][j];
				basic[x][y] = 'X';
				System.out.printf("%4d", basic[i][j]);
			}
			System.out.println();
		}
		

	}

}
