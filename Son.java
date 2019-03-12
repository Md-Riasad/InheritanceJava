package inheitance;

public class Son extends Parents {
	String language; 
	
	public Son(String name, String skin_coller, String height,String language) {
		super(name, skin_coller, height);
		this.name = name;
		this.skin_coller = skin_coller;
		this.height = height;
		this.language =language;
		// TODO Auto-generated constructor stubS
	}


	@Override
	public void details () {
		
		
		System.out.println("\n\nSon  Details:"+" \n Name :"+name+"\n Skin :"+skin_coller+" \n Height :"+height+"\nLanguage :"+language);
		
	}
	
}
