
public abstract class Weapon {
//	public void move() {
//		
//	}
//	public void attack(){
//		
//	}
}
class tank extends Weapon{
	public  void move() {
		System.out.println("tank test move");
	}
	public void attack() {
		System.out.println("attack test move");
	}
}
class Flighter extends Weapon{
	public void move() {
		System.out.println("move test2");
	}
	public void attack() {
		System.out.println("attack test2");
	}
}
class WarShip extends Weapon{
	public void move(){
		System.out.println("move test3");
		
	}
	public void  attank() {
		System.out.println("attack test3");
	}
}
