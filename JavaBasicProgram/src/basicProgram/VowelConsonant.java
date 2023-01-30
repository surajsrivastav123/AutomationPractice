package basicProgram;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		alphabet('a');
		alphabet('b');
	}
	static void alphabet(char ch) {
		if(ch =='a'||ch=='e'||ch=='i'||ch=='o'|ch=='u') {
			System.out.println("aphabet is vowel "+ch);
			
		}
		else {
			System.out.println("alphabet is consonant "+ch);
		}
		}

}
