package dp;

public class strategypattern {

	public static void main(String[] args) {
		Dog tiger =new Dog();
		Item item=new Stick();
		tiger.play(item);
		

	}

}
class BadDog {
	public void play (String item) {
		if(item.equals("stick")) {
				
	}
	else if (item.equals("stone")) {
		
	}
	}
}


	class Dog{
		public void play(Item item) {
			item.execute();
			}
		}
	abstract class Item{
		public abstract void execute();
	}
	class stick extends Item{
		public void execute() {
			System.out.println("you beat i bite.....");
			
		}
	}
		class stone extends Item{
			public void execute() {
				System.out.println("you throw i catch...");
				
			}
		}
	