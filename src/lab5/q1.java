package lab5;
import java.math.*;

public class q1 {

	public static void main(String[] args) {
		String str1 = "albiet";
		String str2 = "half";
		String str3 = "the";
		String str4 = "lick";
		String str5 = "is";
		
		String word = str1+str2+str3+str4+str5;
		
		//For str1 and a = 10
		System.out.println(returner(10,str1));
		//For str1 and a = 33
		System.out.println(returner(33,str1));
		//For str1 and a = 37
		System.out.println(returner(37,str1));
		//For str1 and a = 39
		System.out.println(returner(39,str1));
		//For str1 and a = 41
		System.out.println(returner(41,str1));

		//For str2 and a = 10
		System.out.println(returner(10,str2));
		//For str2 and a = 33
		System.out.println(returner(33,str2));
		//For str2 and a = 37
		System.out.println(returner(37,str2));
		//For str2 and a = 39
		System.out.println(returner(39,str2));
		//For str2 and a = 41
		System.out.println(returner(10,str4));
		
		
		
		//int h = 0;
		//for(int j=0; j<str4.length(); j++) {
			//h += ((int)(str4.charAt(j))*(int)Math.pow(10, (str4.length()-1-j)));
		//}
		
		System.out.println(returner(10,str4));
		
		//For a = 10
		BigInteger h1 = BigInteger.valueOf(0);
		for(int i=0; i<word.length(); i++) {
			h1 = h1.add(BigInteger.valueOf((int)(word.charAt(i)) * (int) Math.pow(10, 18-i)));
		}
		//For a = 33
		BigInteger h2 = BigInteger.valueOf(0);
		for(int i=0; i<word.length(); i++) {
			h2 = h2.add(BigInteger.valueOf((int)(word.charAt(i)) * (int) Math.pow(33, 18-i)));
		}
		//For a = 37
		BigInteger h3 = BigInteger.valueOf(0);
		for(int i=0; i<word.length(); i++) {
			h3 = h3.add(BigInteger.valueOf((int)(word.charAt(i)) * (int) Math.pow(37, 18-i)));
		}
		//For a = 39
		BigInteger h4 = BigInteger.valueOf(0);
		for(int i=0; i<word.length(); i++) {
			h4 = h4.add(BigInteger.valueOf((int)(word.charAt(i)) * (int) Math.pow(39, 18-i)));
		}
		//For a = 41
		BigInteger h5 = BigInteger.valueOf(0);
		for(int i=0; i<word.length(); i++) {
			h5 = h5.add(BigInteger.valueOf((int)(word.charAt(i)) * (int) Math.pow(41, 18-i)));
		}
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		System.out.println(h5);


		
	}
	public static int returner(int value, String str) {
		int h = 0;
		for(int j=0; j<str.length(); j++) {
			h += ((int)(str.charAt(j))*(int)Math.pow(value, (str.length()-1-j)));
		}
		return h;
	}

}
