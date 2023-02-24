package Day09.BookStore;

public class Cart { // 장바구니

	private String[] bookInfo;
	private String bookID;
	private int count;
	private int totalPrice;


	
	public Cart() {
	}
	
	public Cart(String[] bookInfo) {
		this.bookInfo =	 bookInfo;
		this.bookID = bookInfo[0];
		this.count = 1;
		updateTotalprice();

	}
	
	public String[] getBookInfo() {
		return bookInfo;
	}
	
	public void setBookInfo(String[] bookInfo) {
		this.bookInfo = bookInfo;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
		updateTotalprice();
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public void updateTotalprice() {
		this.totalPrice = count * Integer.parseInt (bookInfo[2]);
	}
	
	
	
	
	
}
