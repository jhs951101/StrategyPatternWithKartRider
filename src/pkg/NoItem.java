package pkg;

class NoItem implements Item{

	@Override
	public void use() {
		System.out.println("Sorry. It has no function...");
	}
	
}