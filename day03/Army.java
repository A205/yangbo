import java.lang.reflect.Array;


public class Army {
	Weapon[] W=new Weapon[100];
	int index=0;
	Army(int Max){
		index=Max;
		Weapon[] W=new Weapon[index];
	}
	
	void addWeapon(Weapon wa){
		W[index+1]=wa;
		System.out.println(W[index+1]);
		//		return wa;
	}
	void attackAll(){
		for (int i = 0; i < index; i++) {
			System.out.println(W[i]+"攻击"+"\t");
		}
	}
	void moveAll(){
		for (int i = 0; i < index; i++) {
			System.out.println(W[i]+"移动"+"\t");
		}
	}
	
}
