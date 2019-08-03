package assignment4;

public class PrintMatrixInSnakePattern {

	public static void main(String[] args) {
			int mat[][] = 	 {{10,20,30,40},
							 {15,25,35,45},
							 {50,60,70,80},
							 {55,65,75,85}};
	/*	
		int mat[][] = 	 {{10,20,30},
						  {15,25,35},
						  {50,60,70}};
		*/
		
		     int i = 0;
			  while (i < mat.length) {
				 for (int j = 0; j < mat[i].length;j++) {
					  System.out.print(mat[i][j]+" ");
				  }
				 
				  if (i<mat.length-1) {
					 i++;
				  }else {
					  break;
				  }
				  
				  for (int j = mat[i].length-1 ; j>=0; j--) {
					  System.out.print(mat[i][j]+ " ");
				  }
				  i++;

			  }
			}
	}


