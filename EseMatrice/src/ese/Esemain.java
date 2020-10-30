package ese;


public class Esemain {

	public static void main(String[] args) {
		int[][] matrice={{0,1,1,0,1,0},
						{0,1,1,0,0,0},
						{0,1,1,1,1,0},
						{0,0,1,1,1,0},
						{0,0,1,1,1,0},
						{0,0,1,1,0,0}};
		int i,j;
		for(i=0;i<matrice.length;i++){
			for(j=0;j<matrice[i].length;j++){
				System.out.print(matrice[i][j]);
				}
				if(j==matrice[i].length){
					System.out.println(" ");
			}
		}
		for(i=0;i<matrice.length;i++){
		}
		System.out.print("Sono stati trovati "+ControlloQuadrati(matrice)+" quadrati da 2x2.");
		}
	
	public static int ControlloQuadrati(int matrice[][]){
		int r,c =0;
		int per2=0;
		int per3=0;
		for(r=0;r<matrice.length-1;r++){
			for(c=0;c<matrice.length-1;c++){
						if(matrice[r][c] == 1 &&
							matrice[r][c+1] ==1 &&
							matrice[r+1][c] ==1 &&
							matrice[r+1][c+1] ==1 &&
							matrice[r+1][c+2] == 1 &&
						    matrice[r][c+2] == 1 &&
						    matrice[r+2][c] == 1 &&
						    matrice[r+2][c+1] == 1 &&
						    matrice[r+2][c+2] ==1){
										per3+=1;
										System.out.println("Sono statati trovati " +per3+" quadrati da 3x3");
							}
						if(matrice[r][c] == 1 &&
								matrice[r][c+1] ==1 &&
								matrice[r+1][c] ==1 &&
								matrice[r+1][c+1] ==1){
							per2+=1;
						}
						}
			}
return per2;
	}
	}


