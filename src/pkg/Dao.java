package pkg;

public class Dao extends KartRiderCharacter {
	
	public Dao(Item i){
		itm = i;
	}
	
	public void sayName(){
		System.out.println("Hello. My name is Dao");
	}
}