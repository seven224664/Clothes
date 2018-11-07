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
<<<<<<< HEAD

	//////Size//////
=======
	
<<<<<<< HEAD
	//////Size//////
=======
	//設定尺寸
>>>>>>> c4c73ffeb6abdb5f4347c279bd0fc0cea3a63cfd
>>>>>>> 5041844becbe8cbf20c930abe53836fa0c209c68
	public String getSize(){
		return this.size;
	}
	public void setSize (String size){
		this.size =size;
	}

<<<<<<< HEAD
	//////Color//////
=======
	
<<<<<<< HEAD
	//////Color//////
=======
	//設定顏色
>>>>>>> c4c73ffeb6abdb5f4347c279bd0fc0cea3a63cfd
>>>>>>> 5041844becbe8cbf20c930abe53836fa0c209c68
	public String getColor(){
		return this.color;
	}
	public void setColor (String color){
		this.color =color;
	}
	
	
}