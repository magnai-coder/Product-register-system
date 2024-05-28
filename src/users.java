
public class users {
	private int id;
	private String name;
	private String pass;
	public users(int id, String ner, String kod) { 
		this.id=id;
		name=ner;
		pass=kod;	
	}

public int getCode() { return id;}
public String getName() { return name;}
public String getType() { return pass;}

}
	
