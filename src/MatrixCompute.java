public class MatrixCompute {
	protected Integer[][] createMatrix(){
		int count = 0;
		Integer[][]matrix = new Integer[4][4];
		for(int i=0; i<4; i++){
			for(int j=0;j<4; j++){
				matrix[i][j]= count;
				count++;
			}			
		}		
		return matrix;
	}
		
	protected void rotate(String[][] arr){
		int n = arr.length;
		for(int layer = 0; layer<n/2; layer++){
			int level = n-layer-1;
			
		}
	}
}
