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
	
	//�]�w�ؤo
	public String getSize(){
		return this.size;
	}
	public void setSize (String size){
		this.size =size;
	}

	
	//�]�w�C��
	public String getColor(){
		return this.color;
	}
	public void setColor (String color){
		this.color =color;
	}
	
	
}