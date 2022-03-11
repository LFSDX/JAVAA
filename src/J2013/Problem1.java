package J2013;

import java.util.Calendar;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Problem1 {

	public static int result;
	public static void main(String[] args) {
		//2022年12月31日星期六
		// TODO Auto-generated method stub
//		int l=0;
//		for(int i=2023;;i++)
//		{
//			if(i%400==0) {
//				l+=366;
//			}
//			else if(i%4==0&&i%100!=0)
//			{
//				l+=366;
//			}
//			else {
//				l+=365;
//			}
//			if(i%100==99)
//			{
//				if(l%7==1)
//				{
//					result=i;
//					break;
//				}
//			}
//		}
//		System.out.print(result);
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.MONTH, 11);
		calendar.set(Calendar.DAY_OF_MONTH, 31);
		calendar.set(Calendar.YEAR,2299);
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(calendar.DAY_OF_WEEK));
//		for(int i=20;;i++)
//		{
//			calendar.set(Calendar.YEAR, Integer.valueOf((String.valueOf(i)+String.valueOf(99))));
//			if(calendar.DAY_OF_WEEK==Calendar.SUNDAY)
//			{
//				System.out.print(i);
//				return;
//			}
//		}
	}
	//2299
}
