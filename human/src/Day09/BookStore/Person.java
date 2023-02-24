package Day09.BookStore;

public class Person { //변수, 생성자, 메소드
	private String name;
	private String tel;
	private String address;
	
	public Person() {
		
	}

	public Person(String name, String tel) {
		this.name = name;
		this.tel = tel;
		
	}
	public Person(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
}
