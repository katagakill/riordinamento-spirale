package rioridinamentoaspirale;
import java.util.Scanner;

public class riordinamentoaspirale {
	public static void riempi(int v[][]) {
	int col=0;
	int row=0;
	int p=0;
	int s=1;

	
	for(col=0;col<v.length;col++) {
		v[row][col]=s++;
		
	}
	for(row=1;row<v.length;row++) {
		v[row][col-1]=s++;
	}
	for(col=v.length-2;col>=0;col--) {
		v[row-1][col]=s++;
		
	}
	for(row=v.length-2;row>=1;row--) {
		v[row][col+1]=s++;
	}


	
}
	
public static void stampa(int v[][]) {
	
	for(int i=0;i<v.length;i++) {
		for(int j=0;j<v[0].length;j++) {
			System.out.print(" "+v[i][j]);
			}
		System.out.println("");
		}
		


}


	public static void main(String[] args) {
		Scanner tastiera=new Scanner(System.in);
		int v[][];
		int row;
		System.out.println("inserisci il numero delle righe, il numero delle colonne sara' uguale.");
		System.out.println("cosi' eseguiro' il riordinamento a spirale");
		row=tastiera.nextInt();
		v= new int [row][row];
		riempi(v);
		stampa(v);
		
		
		

	}

}
