
public class Reponse {
	static int reponse1(int [] numbers ) {
		int npc = 0;
		for (int i=1; i<= numbers[0]; i++){
		npc = npc + (i*i);
		}
		return npc;
	}
	
	static String reponse1(String [] numbers ) {
		return "-1" ;
	}
	
	static int reponse(String [] numbers ) {
		return -1 ;
	}
	
	static String reponse(int [] numbers ) {
		return "-1" ;
	}
}
