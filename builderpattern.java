package builderpattern;

public class builderpattern {

	public static void main(String[] args) {
		Computer mycomputer=new Computer.BuildComputer().setcabinet("glass cabinet").Build();
		System.out.println(mycomputer);
		

	}

}
class Computer{
	private String cabinet;
	private String ram;
	private String cpu;
	private String harddisk;
	public Computer(BuildComputer bc) {
		 this.cabinet=bc.cabinet;
		 this.ram=bc.ram;
		 this.harddisk=bc.harddisk;
		 this.cpu=bc.cpu;
		 
		 
	}
	
public String toString() {
	return
	this.cabinet+":"+this.ram+":"+this.cpu+":"+this.harddisk;
	
}
static class BuildComputer{
	private String cabinet;
	private String ram;
	private String cpu;
	private String harddisk;
	public BuildComputer setcabinet(String cabinet) {
		this.cabinet=cabinet;
		return this;
		
	}
public Computer Build() {
	return new Computer(this);
	
}
}
}