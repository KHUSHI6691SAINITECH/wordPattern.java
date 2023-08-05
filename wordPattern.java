
public class AssigmentN1 {
	public static void main(String[] args) {
		int n = 5;
		for(int i=0; i<n; i++) {
			//***********This is for I************
			for(int j=0; j<n; j++) {
				if( j==(n-1)/2 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//*****This is for N **********
			for(int j=0; j<n; j++) {
				if(j==0 || j==(n-1) || i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
	     	}
			//**********This is for E ****************
			for(int j=0; j<n; j++) {
				if(i==0 && j>n/4 && j<n-1 || i==(n-1) && j>n/4 && j<n-1 || i==(n-1)/2 && j>n/4 && j<= (n-1)/2 || j==n/4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//**********This is for U *************************
			for(int j=0; j<n; j++) {
				if(j==0 && i!=n-1 || j==(3*n)/4 && i!=n-1 || i==n-1 && j>0 && j<(3*n)/4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//***************This is for R ************************ 
			for(int j=0; j<n; j++) {
				if(j==0 || (i==0 && j<=(n-1)/2)|| (i==(n-1)/2 && j<(n-1)/2) || i==j && i>((n-1)/2)-1 && j>=(n-1)/2  || j==((n+1)/2) && i!=0 && i<(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//************This is for O ************************
			for(int j=0; j<n; j++) {
				if(j==0 && i!=0 && i!=n-1 || j==(3*n)/4 && i!=0 && i!=n-1 || i==0 && j>0 && j<(3*n)/4  ||  i==n-1 && j>0 && j<(3*n)/4  ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//*************This is for N ***********************************
			for(int j=0; j<n; j++) {
				if(j==0 || j==(n-1) || i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
	     	}
			System.out.println();
		}
			System.out.println();
	}

}
