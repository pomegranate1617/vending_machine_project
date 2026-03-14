package vending_machine;

import java.util.ArrayList;

public class TestMain {
	public static void main(String[] args) {
		//돈통 생성
		CashRegister cashRegister = new CashRegister(1000000);
		
		//각 음료 저장고 생성:총4개 생성,비어있는 음료 리스트를 제공
		BeverageStorage beverageStorage1 = new BeverageStorage(1,new ArrayList<Beverage>());
		BeverageStorage beverageStorage2 = new BeverageStorage(2,new ArrayList<Beverage>());
		BeverageStorage beverageStorage3 = new BeverageStorage(3,new ArrayList<Beverage>());
		BeverageStorage beverageStorage4 = new BeverageStorage(4,new ArrayList<Beverage>());
		//음료 저장고모음 생성 
		BeverageRegister beverageRegister = new BeverageRegister(new ArrayList<BeverageStorage>());
		
		//음료 저장고모음에 각 음료 저장고를 넣음.
		beverageRegister.addStorage(beverageStorage1);
		beverageRegister.addStorage(beverageStorage2);
		beverageRegister.addStorage(beverageStorage3);
		beverageRegister.addStorage(beverageStorage4);
		//음료저장고모음의 게이트리스트를 생성
		beverageRegister.setGateList(new ArrayList<Integer>());
		//게이트 번호 부여
		for(int i=1;i<=4;i++) {
			beverageRegister.addGateNum(i);
		}
		//자판기 생성
		VendingMachine vendingmachie = new VendingMachine(cashRegister,beverageRegister);
		
		//음료 생성,각 음료마다 10개씩 생성후 각 음료에 맞는 저장고에 저장
		for(int i=0;i<10;i++) {
			Beverage coffe = new Beverage("라떼",1200,i);
			beverageStorage1.addBeverList(coffe);
			if(beverageStorage1.getName()== null) {
				beverageStorage1.setName(coffe);
			}
			
			Beverage greenTea = new Beverage("녹차",800,i);
			beverageStorage2.addBeverList(greenTea);
			if(beverageStorage2.getName()== null) {
				beverageStorage2.setName(greenTea);
			}
			
			Beverage juice = new Beverage("오렌지 주스",1500,i);
			beverageStorage3.addBeverList(juice);
			if(beverageStorage3.getName()== null) {
				beverageStorage3.setName(juice);
			}
			
			Beverage water = new Beverage("생수",600,i);
			beverageStorage4.addBeverList(water);
			if(beverageStorage4.getName()== null) {
				beverageStorage4.setName(water);
			}
		}
		
		
		
	}
}
