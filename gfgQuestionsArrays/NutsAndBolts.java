package gfgQuestionsArrays;

public class NutsAndBolts {

	public static void main(String[] args) {
		int size = 5,index=0,index2=0;
		char[] nuts = {'@','%','$','#','^'};
		char[] bolts = {'%','@','#','$','^'};
		char[] com = {'!','#','$','%','&','*','@','^','~'};
		
		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < nuts.length; j++) {
				if(com[i] == nuts[j]) {
					char temp = nuts[index];
					nuts[index] = nuts[j];
					nuts[j] = temp;
					index++;
				}
				if(com[i] == bolts[j]) {
					char temp = bolts[index2];
					bolts[index2] = bolts[j];
					bolts[j] = temp;
					index2++;
				}
			}
			
		}
		for(char c: nuts) {
			System.out.print(c + " ");
		}
		System.out.println();
		for(char c: bolts) {
			System.out.print(c + " ");
		}
	}

}
