package pkg;

public abstract class KartRiderCharacter {
	protected Item itm;
	
	public void setItem(Item i){
		this.itm = i;
		System.out.println("The item has been changed");
	}
	
	public void useItem(){
		itm.use();
	}
	
	public abstract void sayName();
}