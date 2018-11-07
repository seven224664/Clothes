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
	
	//設定尺寸
	public void setSize (String size){
		this.size =size;
	}
	public String getSize(){
		return this.size;
	}
	
	//設定顏色
	public void setColor (String color){
		this.color =color;
	}
	public String getColor(){
		return this.color;
	}
	
	
	
}