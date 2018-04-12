import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Ta klasa tworzy macierz i ma metody dodawania, odejmowania i mnorzenia macierzy

public class Macierz {
	
		Scanner in = new Scanner(System.in);
		
	public int[][] Create(int size, int multi){
		
		int[][] macierzA = new int[size][size];
		
		for(int i = 0; i < macierzA.length; i++){
			for(int j=0; j < macierzA[i].length; j++){
				macierzA[i][j] = (i+j)*multi;
			}
		}
		
		return macierzA;
	}
	
	
	public static int[][] Zero(int size){
		
		int[][] macierzA = new int[size][size];
		
		for(int i = 0; i < macierzA.length; i++){
			for(int j=0; j < macierzA[i].length; j++){
				macierzA[i][j] = 0;
			}
		}
		
		return macierzA;
	}
	public int Size(){
		int actualSize = 0;
		System.out.println("podaj liczbê z przedzia³u 3-100");
		while(actualSize == 0){
			int size = in.nextInt();
			if(size < 3 || size > 100){
				System.out.println("podana liczba nie zawiera siê w przedziale");
				System.out.println("podaj liczbê ca³kowit¹ z przedzia³u 3-100");

			}
			else{
				actualSize = size;
				
			}
		}
		return actualSize;
	}	
	
	public int[][] Add(int size, int[][] macierzA, int[][] macierzB){
		
		int[][] macierzC = new int[size][size];
			
		for(int i = 0; i < macierzC.length; i++){
			for(int j=0; j < macierzC[i].length; j++){
				macierzC[i][j] = macierzA[i][j] + macierzB[i][j];
			}
		}
		
		return macierzC;
	}
	
	public int[][] Substract(int size, int[][] macierzA, int[][] macierzB){
		
		int[][] macierzC = Zero(size);

		for(int i = 0; i < macierzC.length; i++){
			for(int j=0; j < macierzC[i].length; j++){
				macierzC[i][j] = macierzA[i][j] - macierzB[i][j];
			}
		}
		
		return macierzC;
	}
	
	public int[][] Multiply(int size, int[][] macierzA, int[][] macierzB){
		
		int[][] macierzC = new int[size][size];

		for(int i = 0; i < macierzC.length - 1; i++){
			for(int j=0; j < macierzC[i].length - 1; j++){
				macierzC[i][j] = macierzA[i][j] * macierzB[j][i];
			}
		}
		
		return macierzC;
		
	}
	
	public void Save(String fileName, int[][] macierz) throws FileNotFoundException{
		
		PrintWriter save = new PrintWriter(fileName);
		
		for(int i = 0; i < macierz.length; i++){
			for(int j=0; j < macierz[i].length; j++){
				save.print(macierz[i][j] + " ");
			}
			save.println();
		}
		save.close();
	}
	
	public void Load(String fileName) throws FileNotFoundException{
		File file = new File(fileName);
		Scanner fileLoad = new Scanner(new File(fileName));
		
		while(fileLoad.hasNextLine()){
			System.out.println(fileLoad.nextLine());
		}
		
	}
}
