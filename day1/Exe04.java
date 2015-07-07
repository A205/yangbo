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
		System.out.println("请输入1-3的数字（1-增加一个学生；2-显示所有学生；3-退出程序）：");
		int input=In.nextInt();
		/**
		 * 输入一个选择的数字
		**/
		if(input==1){
			Scanner Student=new Scanner(System.in);
			System.out.println("请输入学生姓名：");
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
//			System.out.println("请关闭窗口");
		}
		else {
			System.out.println("输入错误！请重新输入");
			main(args);
		}

		
		
	}
}
