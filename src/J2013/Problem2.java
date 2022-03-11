package J2013;

import java.util.LinkedList;

public class Problem2 {
	public static LinkedList<String> tempLinkedList=new LinkedList<String>();
	public static int result=0;
	public static String [][]s;
	public static String  answer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				s=new String[4][5];
				s[0][0]="从";
				s[0][1]="我";
				s[0][2]="做";
				s[0][3]="起";
				s[0][4]="振";
				s[1][0]="我";
				s[1][1]="做";
				s[1][2]="起";
				s[1][3]="振";
				s[1][4]="兴";
				s[2][0]="做";
				s[2][1]="起";
				s[2][2]="振";
				s[2][3]="兴";
				s[2][4]="中";
				s[3][0]="起";
				s[3][1]="振";
				s[3][2]="兴";
				s[3][3]="中";
				s[3][4]="华";
				answer="从我做起振兴中华";
				seek(0, 0, 0);
				System.out.print(result);
	}
	public  static void seek(int i,int j,int length)//i表示当前处于的行号，j表示列号,a表示从哪个方向到此点,length表示长度
	{
		if(length<=6) {
		if(s[i][j].equals(answer.substring(length, length+1))) {
			if(length==6)
			{
				result++;
				return;
			}
			if(i+1<=3)	//向下走
			{
				seek(i+1, j, length+1);
			}
			if(j+1<=4)//向右走
			{
				seek(i, j+1, length+1);
			}
		}
		else {
			return;
		}
	}
	}
	//35
}
