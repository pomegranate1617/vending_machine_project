package vending_machine;

public class Beverage {
	//음료
	private  final String name;
	private int price;
	//각 음료의 고유번호
	private int drinkNum;
	
	public Beverage(String name,int price,int drinkNum) {
		this.name = name;
		this.price = price;
		this.drinkNum = drinkNum;
	}
	//음료가 하는 동작?가격변경밖에 더 있나..?;;
	public void setPrice(int price) {
		this.price = price;
		System.out.println("가격이 변경되었습니다.\n변경 가격:"+price);
	}
	public int getDrinkNum() {
		return this.drinkNum;
	}
	public String getName() {
		return this.name;
	}
}
