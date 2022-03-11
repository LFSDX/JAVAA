package J2013;

import java.math.BigInteger;

public class Problem3 {

	public static BigInteger result=new BigInteger("1");
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<11213;i++)
		{
			BigInteger tempBigInteger=new BigInteger("2");
			result=result.multiply(tempBigInteger);
		}
		result=result.subtract(new BigInteger("1"));
		String a=result.toString();
		System.out.println(a);
		System.out.println(a.length());
		System.out.println(a.substring(a.length()-100));
	}
	//8586718527586602439602335283513944980064327030278104224144971883680541689784796267391476087696392192
}
