package co.jeongeun.prj.vo;

public class DevVo { //VO 객체, DTO 객체

	private int id;
	private String name;
	private String address;
	private int age;
	
	public DevVo() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
//		System.out.print("ID : "+id);
//		System.out.print("NAME : "+name);
//		System.out.print("address : "+address);
//		System.out.println("age : "+age);
		
		
		return "[ID:"+id+"| Name:"+name+"| address:"+address+"| age:"+age+"]";
		
	}
	
}
