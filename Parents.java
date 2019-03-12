package inheitance;

public class Parents {

	String name ,skin_coller , height;
	
	public Parents(String name, String skin_coller, String height) {
		super();
		this.name = name;
		this.skin_coller = skin_coller;
		this.height = height;
	}

	public void details () {
//	name = "Riasad" ;
//	skin_coller ="Black";
//	height ="6";
		System.out.println(" parent  Details:"+" \n Name :"+name+"\n Skin :"+skin_coller+" \n Height :"+height);
	}
}
