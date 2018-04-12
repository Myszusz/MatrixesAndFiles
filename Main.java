import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner fileIn = new Scanner(new File("macierzA.txt"));

		Macierz macierz = new Macierz();
		
		
		
		int size = macierz.Size();
		int[][] macierzA = macierz.Create(size, 2);
		int[][] macierzB = macierz.Create(size, 1);
		int[][] macierzAplusB = macierz.Add(size, macierzA, macierzB);
		int[][] macierzAminusB = macierz.Substract(size, macierzA, macierzB);
		int[][] macierzAtimesB = macierz.Multiply(size, macierzA, macierzB);
		int[][] macierzBtimesA = macierz.Multiply(size, macierzB, macierzA);
		
		macierz.Save("macierzA.txt", macierzA);
		macierz.Save("macierzB.txt", macierzB);
		macierz.Save("macierzAplusB.txt", macierzAplusB);
		macierz.Save("macierzAminusB.txt", macierzAminusB);
		macierz.Save("macierzAtimesB.txt", macierzAtimesB);
		macierz.Save("macierzBtimesA.txt", macierzBtimesA);

		System.out.println("MacierzA: ");
		macierz.Load("macierzA.txt");
		
		System.out.println();
		System.out.println("MacierzB: ");
		macierz.Load("macierzB.txt");
		}
}
