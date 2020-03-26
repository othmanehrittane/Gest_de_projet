import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Programme {
	
	
	public static void tester(String chemin) throws IOException {
		int  nb=0,nb2=0;
		String line, type, typeres;
		Scanner s = new Scanner(System.in);
		BufferedReader f = new BufferedReader(new FileReader(chemin));
		type = f.readLine();
		typeres =f.readLine();
		if (type.equals("int") && typeres.equals("int")){
			while((line = f.readLine()) != null ) {
				String[] tab = line.split(" ");
				int[] argu = new int[tab.length-1];
				int i;
				for(i=0 ;i<tab.length-1; i++){
					argu[i]= Integer.parseInt(tab[i]);
				}
				int rep = Integer.parseInt(tab[tab.length-1]);
				if(Reponse.reponse1(argu)==(rep)) {
					System.out.println("Votre fonction marche");
					nb++;
				}
				else {
					System.out.print("Votre fonction ne marche pas pour ce cas ' ");
					nb2++;
					for(int j=0;j<argu.length;j++){
						System.out.print(argu[j]+" ");
					}
					System.out.println("'");
				}

			}
			System.out.println("Vous avez "+nb+"/"+(nb+nb2));
		} else if (type.equals("string") && typeres.equals("string")){
			while((line = f.readLine()) != null ) {
				String[] tab = line.split(" ");
				String[] argu = new String[tab.length-1];
				int i;
				for(i=0 ;i<tab.length-1; i++){
					argu[i]= tab[i];
				}
				String rep = tab[tab.length-1];
				//System.out.print(rep+" "+argu[0]+" "+argu[1]+" "+argu[2]);
				if(Reponse.reponse1(argu).equals(rep)) {
					System.out.println("Votre fonction marche");
					nb++;
				}
				else {
					System.out.println("Votre fonction ne marche pas en ce cas:");
					nb2++;
					for(int j=0;j<argu.length;j++){
						System.out.print(argu[j]+" ");
					}
					System.out.println("'");
				}

			}
			System.out.println("Vous avez "+nb+"/"+(nb+nb2));
		} else if (type.equals("string") && typeres.equals("int")){
			while((line = f.readLine()) != null ) {
				String[] tab = line.split(" ");
				String[] argu = new String[tab.length-1];
				int i;
				for(i=0 ;i<tab.length-1; i++){
					argu[i]= tab[i];
				}
				int rep = Integer.parseInt(tab[tab.length-1]);
				//System.out.print(rep+" "+argu[0]+" "+argu[1]+" "+argu[2]);
				if(Reponse.reponse(argu)==(rep)) {
					System.out.println("Votre fonction marche");
					nb++;
				}
				else {
					System.out.println("Votre fonction ne marche pas en ce cas:");
					nb2++;
					for(int j=0;j<argu.length;j++){
						System.out.print(argu[j]+" ");
					}
					System.out.println("'");
				}

			}
			System.out.println("Vous avez "+nb+"/"+(nb+nb2));
		} else if (type.equals("int") && typeres.equals("string")){
			while((line = f.readLine()) != null ) {
				String[] tab = line.split(" ");
				int[] argu = new int[tab.length-1];
				int i;
				for(i=0 ;i<tab.length-1; i++){
					argu[i]= Integer.parseInt(tab[i]);
				}
				String rep = tab[tab.length-1];
				//System.out.print(rep+" "+argu[0]+" "+argu[1]+" "+argu[2]);
				if(Reponse.reponse(argu).equals(rep)) {
					System.out.println("Votre fonction marche");
					nb++;
				}
				else {
					System.out.println("Votre fonction ne marche pas en ce cas:");
					nb2++;
					for(int j=0;j<argu.length;j++){
						System.out.print(argu[j]+" ");
					}
					System.out.println("'");
				}

			}
			System.out.println("Vous avez "+nb+"/"+(nb+nb2));
		}


	}
}
