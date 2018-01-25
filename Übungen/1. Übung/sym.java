public class sym{
	
	public static void main(String[] args){
		sym prog = new sym();
		prog.test();
	}
	
	public void test(){
		String s = "0 2 13 13 6 12 10 16 10 6 1 12 12 12 3 15 11 3 6 4 2 0 11 11 8 10 8 14 8 6 3 14 10 10 3 13 9 1 4 2 13 11 0 6 9 3 3 5 9 7 14 5 1 9 10 6 8 10 7 9 13 11 6 0 9 3 5 3 3 7 14 11 7 3 10 2 2 10 7 9 6 8 9 9 0 8 6 12 8 2 5 6 8 8 5 11 7 7 4 8 12 10 3 3 8 0 2 4 6 6 13 8 4 6 9 3 5 9 6 8 10 8 3 5 6 2 0 6 8 4 11 6 2 8 7 5 7 7 4 8 16 14 5 3 12 4 6 0 6 10 17 10 6 4 13 1 5 13 10 12 10 8 9 3 8 6 8 6 0 6 11 14 10 2 7 5 1 7 4 6 6 6 7 7 2 6 4 10 6 0 7 8 6 6 3 9 5 5 2 6 1 3 14 14 5 13 11 17 11 7 0 11 13 13 4 16 12 4 7 5 12 14 5 11 6 8 6 10 14 8 11 0 4 14 11 11 13 13 10 14 12 10 1 7 8 4 2 6 10 6 13 4 0 10 9 7 9 9 6 10 12 10 9 3 8 6 8 4 2 6 13 14 10 0 9 3 1 9 6 8 3 3 10 10 5 9 7 13 7 3 4 11 9 9 0 12 8 2 3 3 15 13 6 2 11 3 5 1 5 9 16 11 7 3 12 0 4 12 9 11 11 9 8 2 7 5 7 5 1 5 12 13 9 1 8 4 0 8 5 7 3 1 10 10 7 9 7 13 7 5 4 13 9 9 2 12 8 0 3 1 6 4 7 7 4 6 4 10 4 2 7 10 6 6 3 9 5 3 0 4 4 2 9 9 8 8 8 12 6 6 5 14 10 8 3 11 7 1 4 0";
		
		String[] arr = this.konvertToArray(s);
		
		int[][] matrix = this.createMatrix(arr,20);
		
		System.out.println(this.testMatrix(matrix));
	}
	
	public String[] konvertToArray(String s){
		
		return s.split(" ");
	}
	
	public int[][] createMatrix(String[] arr, int size){
		int[][] matrix = new int[size][size];
		
		for(int i=0; i< size;i++){
			for(int j=0; j<size; j++){
				int tmp = Integer.parseInt(arr[i*size+j]);
				matrix[i][j]=tmp;
			}
		}
		
		return matrix;
	}
	
	public boolean testMatrix(int[][] matrix){
		
		for(int i=0; i< matrix.length;i++){
			for(int j=0; j<matrix.length; j++){
				if(matrix[i][j] != matrix[j][i]){
					System.out.println("Not matching (i="+i+"; j="+j+"): "+ matrix[i][j] +"!="+ matrix[j][i]);
					return false;
				}
			}
		}
		return true;
	}
}