package Clothes;

public class Clothes{
	
	private String size;
	private String color;
	
	public Clothes(){
	}
	
	public Clothes(String size){
		this();
		this.size = size;
	}
	
	public Clothes(String size,String color){
		this(size);
		this.color = color;
	}
	
	//�]�w�ؤo
	public void setSize (String size){
		this.size =size;
	}
	public String getSize(){
		return this.size;
	}
	
	//�]�w�C��
	public void setColor (String color){
		this.color =color;
	}
	public String getColor(){
		return this.color;
	}
	
	
	
}