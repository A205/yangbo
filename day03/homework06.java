import java.security.interfaces.DSAKey;


public class homework06 {
public static void main(String[] args) {
	Army a=new Army(2);
	for (int index = 0; index <2; index++) {
		System.out.println(a.W[index]);
	}
	
	tank oTank=new tank();
	a.addWeapon(oTank);
	a.attackAll();
	a.moveAll();
	
}
}
