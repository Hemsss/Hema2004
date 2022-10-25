package factory;

public class factorypattern {

	public static void main(String[] args) {
		Cakeshop myshop=new Cakeshop();
		myshop.setcakeFactory(new RaniCakefactory());
		
		System.out.println(myshop.sellCake());
		

	}

}
class BadCakeshop{
	public Cake sellCake(int i) {
		if(i==1) {
			RajaCakeFactory rc=new RajaCakeFactory();
			return rc .makecake();
			
			
		}
		
		else if (i==2) {
			Ranicakefactory rani =new Ranicakefactory();
			return rani.makecake();
			
			
			
		}
		
		else {
			return null;
			
		}
	}
}

class Cakeshop{
	CakeFactory cakefactory;
	public void setCakefactory(Cakefactory cakefactory) {
		
		this.cakefactory=cakefactory;
		
	}
	 
	public cake sellcake() {
		return cakefactory.makecake();
		
	}
}

abstract class Cakefactory{
	public abstract cake makecake();
	
}
class RajaCakefactory extends Cakefactory{
	public Cake makecake() {
		return new
				Cake.cakemaker().setCaketype("forest.raja").setshape("square..").setweight(1).build();
		
		
	}
}


class RaniCakefactory extends Cakefactory{
	public Cake makeCake() {
		return new
				Cake.cakemaker().setCaketype("softy.rani").setshape("round").setweight(2).build();
		
	}
}


class Cake{
	int weight;
	String shape;
	String caketype;
	public String toString() {
		return" the cake is...:"+caketype+"weight...:"+weight+":shape.."+shape;
		
	}
	
	public Cake(Cakemaker cm) {
		weight =cm.weight;
		shape=cm.shape;
		caketype=cm.caketype;
		
	}
	
	static class Cakemaker{
		int weight;
		String shape;
		String caketype;
		public Cakemaker setweight(int weight) {
			this.weight=weight;
			return this;
			
		}
		
		
		public Cakemaker setcaketype(String shape) {
			this .shape=shape;
			return this;
			
			
		}
		
		public Cakemaker setcaketype(String caketype) {
			this.caketype=caketype;
			return this;
		}
		
		
		public Cake build() {
			return new cake (this);
			
		}
	}
}

