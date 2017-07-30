public class QueensProblem {

	static int N = 8;
	static int[] chessboard = new int [N];
	static int index = 0;
	static int version = 0;
	
	public static void main(String[] args){

		while (chessboard[0]<N) {
			
			if (checked()){	
				
				if (index == (N-1)) {	
					System.out.print(++version + ": ");
					printResult(chessboard);
					chessboard[index]++;
				}
				else { 
					index++;
				}
				
			}
			else {	
				chessboard[index]++;
			}
			
		}
	
	}

	static boolean checked() {

		if (index == 0) {
			return true;
		}

		if (chessboard[index]>(N-1)){
			chessboard[index] = 0;
			index--;
			return false;
		}

		for (int i=0; i<index; i++){
			if ((chessboard[index] == chessboard[i]) || ((Math.abs(chessboard[index] - chessboard[i])) == (index-i))){
				return false;
			}
		}

		return true;
	}
	
	// Print the board
	private static void printResult(int[] tempChessboard) {
		int j;
		for (j = 0; j < (tempChessboard.length-1); j++){
			System.out.print("["+j+"]="+tempChessboard[j]+" ");
		}
		System.out.println("["+j+"]="+tempChessboard[j]+" ");
	}
	
}
