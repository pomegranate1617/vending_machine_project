 package vending_machine;

import java.util.List;
//BeverageStorage의 집합체?
//저장고에 있는 음료를 빼내는 일을하고...각 게이트는 저장고의 번호와 같음.
//특정음료 선택시 해당 저장고가 지목되며 그 저장고의 번호와 같은 게이트가 오픈되어 음료 토출
public class BeverageRegister {
	//자판기 내부의 음료 배출 기계?
	//여러개의 Beㅍerage를 자판기에 하나씩 직접 연결하는 것보다 하나로 묶어서 연결하는게 낫다고 생각해서 추상클래스로 묶음
	//BeberageStorage와 조립됨?
	//BeberageStorage의 리스트를 필드로 가짐
	//아..사용하면 안되는구나...Beverage필드까지 같이 물려받게 되네;;그렇다고static을 쓰는 것도 안되고;;
	//그럼 공통적인 BeverageStorage가 공통적으로 가지는 필드 위주 구성...해봐야 겠다..
	//인터페이스로 써볼까?근데 그러면 필드가 상수 필드밖에 안되잖아;;
//	private BeverageStorage beveragestorage;
	//음료 저장고의 리스트(한음료를 저장하고 있는 저장고의 리스트)
	private List<BeverageStorage> storageList;
	//게이트의 번호
	private List<Integer> gateList;
	
	public BeverageRegister(List<BeverageStorage> storageList) {
		this.storageList = storageList;
	}
	
	
	public void addStorage(BeverageStorage beverageStorage) {
		this.storageList.add(beverageStorage);
		System.out.println(beverageStorage.getNumber()+"저장고가 조립되었습니다.");
	}
	public void setGateList(List<Integer> gateList) {
		 this.gateList = gateList;
	}
	//beveragestorage를 열거나 닫는 동작을 함?
	//=>BeverageRegister가 직접 게이트를 가지고 있고 그를 조작하는 것으로 변경
	public void addGateNum(int gateNum){
		this.gateList.add(gateNum);
		System.out.println(gateNum+"번 게이트가 연결되었습니다.");
	}
	//특정 게이트 열기
	public void openGate() {
		
	}
	
}
