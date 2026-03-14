package vending_machine;

import java.util.List;

public class BeverageStorage {
	//자판기 내부 음료 배출기계?안에 있는 각 음료 저장고
	//한 스토리지당 한 종류의 음료를 집어넣음->음료 객체의 이름을 사용?
	private String name=null;
	//스토리지가 가지고 있는 고유 번호
	private final int number;
	private List<Beverage> beverList;
	//음료 종류는 음료가 생성된 후에 각 스토리지당 배당시작하므로 생성자에서 초기화x
	public BeverageStorage(int number,List<Beverage> beverList) {
		this.number = number;
		this.beverList = beverList;
	}
	
	//가지고 있는 고유번호가 호출되면 음료를 배출하기 위해 문이 열림
	public boolean dispenseOpen(int number) {
		if(number == this.number) {
			//자판기자체에서 나온 번호가 고유번호와 일치하면 자판기를 열고 true를 반환
			return true;
		}
		else return false;
	}
	//리스트에 같은 종류의 음료들 추가.
	public void addBeverList(Beverage beverage) {
		this.beverList.add(beverage);
		System.out.println(beverage.getName()+beverage.getDrinkNum()+"가 추가되었습니다.");
	}
	public int getNumber() {
		return this.number;
	}
	public void setName(Beverage beverage) {
		this.name= beverage.getName();
	}
	public String getName() {
		return this.name;
	}
}
