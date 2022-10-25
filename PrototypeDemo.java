package prototype;

public class PrototypeDemo {

	public static void main(String[] args)throws Exception {
		Sheep mothersheep=new Sheep();
		Sheep dolly=mothersheep.createclone();
		
		mothersheep.name="i am mothersheep";
		dolly .name="i am the clone dolly";
		System.out.println(dolly.name);
        System.out.println(mothersheep.name);
        
        
		

	}

}
class Sheep implements Cloneable{
	String name;
	public sheep() {
		System.out.println("sheep object created.......");
		
	}
public Sheep createclone()throws Exception{
	return(Sheep)
	super.clone();
	
}
}