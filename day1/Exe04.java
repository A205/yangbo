import java.awt.List;
import java.awt.Window;
import java.io.StreamCorruptedException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Exe04 {
	int i;
	public static void main(String[] args) {
		int index=0;
		String[] list=new String[100];
		Scanner In=new Scanner(System.in);
		System.out.println("������1-3�����֣�1-����һ��ѧ����2-��ʾ����ѧ����3-�˳����򣩣�");
		int input=In.nextInt();
		/**
		 * ����һ��ѡ�������
		**/
		if(input==1){
			Scanner Student=new Scanner(System.in);
			System.out.println("������ѧ��������");
			String Name=Student.nextLine();
			list[index]=Name;
			String[] list1=new String[index];

			index++;
			main(args);
		}
		else if (input==2) {
			for (int i = 0; i <=index-1; i++) {
				System.out.println(list[i]);
			}
			main(args);
		}
		else if (input==3) {
			System.exit(0);
//			System.out.println("��رմ���");
		}
		else {
			System.out.println("�����������������");
			main(args);
		}

		
		
	}
}
