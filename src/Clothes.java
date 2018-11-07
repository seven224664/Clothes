package Clothes;

public class Clothes{
	
	private String size;
	private String color;
	
	public Clothes(){
	}
	public Clothes(String size){
		this();
		setSize(size);
	}
	public Clothes(String size,String color){
		this(size);
		setColor(color);
	}
	
	//////Size//////
	public String getSize(){
		return this.size;
	}
	public void setSize (String size){
		this.size =size;
	}

	
	//////Color//////
	public String getColor(){
		return this.color;
	}
	public void setColor (String color){
		this.color =color;
	}
	
	
}