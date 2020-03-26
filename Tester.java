import java.io.*;
import java.util.Scanner;
public class Tester {



	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Rentrez le chemin du fichier svp");
		String chemin = sc.nextLine();
		Programme.tester(chemin);
	}

}
