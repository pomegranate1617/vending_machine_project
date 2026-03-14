package vending_machine;

public class VendingMachine {
	//Beverageregiset를 조립
	//CashRegister조립
	private CashRegister cashRegister;
	private BeverageRegister beverageRegister;
	//돈이 일정 금액 투입되었는가 체크
	private boolean minCheck;
	//음료버튼이 선택 되었는가 체크
	
	//선택된 음료의 리스트 작성(여러개 구매 가능할 수도 있으니까)
	
	//확인 버튼이 눌렸는가 체크
	private boolean okCheck;
	//음료를 내보낼 준비가 되었는가 체크
	private boolean outputCheck;
	
	//돈통이랑 음료저장고 객체 결합
	public VendingMachine(CashRegister cashRegister,BeverageRegister beverageRegister) {
		this.cashRegister = cashRegister;
		this.beverageRegister = beverageRegister;
	}
	
	public boolean getOkCheck() {
		return this.okCheck;
	}
	
	
}
