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
				s[0][0]="��";
				s[0][1]="��";
				s[0][2]="��";
				s[0][3]="��";
				s[0][4]="��";
				s[1][0]="��";
				s[1][1]="��";
				s[1][2]="��";
				s[1][3]="��";
				s[1][4]="��";
				s[2][0]="��";
				s[2][1]="��";
				s[2][2]="��";
				s[2][3]="��";
				s[2][4]="��";
				s[3][0]="��";
				s[3][1]="��";
				s[3][2]="��";
				s[3][3]="��";
				s[3][4]="��";
				answer="�������������л�";
				seek(0, 0, 0);
				System.out.print(result);
	}
	public  static void seek(int i,int j,int length)//i��ʾ��ǰ���ڵ��кţ�j��ʾ�к�,a��ʾ���ĸ����򵽴˵�,length��ʾ����
	{
		if(length<=6) {
		if(s[i][j].equals(answer.substring(length, length+1))) {
			if(length==6)
			{
				result++;
				return;
			}
			if(i+1<=3)	//������
			{
				seek(i+1, j, length+1);
			}
			if(j+1<=4)//������
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
