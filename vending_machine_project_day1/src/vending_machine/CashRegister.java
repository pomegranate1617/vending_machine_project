package vending_machine;

public class CashRegister {
	//돈보관,계산,배출?,위조지폐확인
	//돈을 보관하니까 돈을 리스트로 가져야 되나?
	private Money inputMoney = null;//넣은 돈
	private int totalInputMoney;//넣은 돈의 총합
	private int storageMoney;//보관하고 있는 돈 총액
								//보관하고 있는 각 금액의 돈 리스트
	private boolean forgeryCheck = false;//위조 체크
	
	//처음 생성시 넣은 돈이 없으니 거스름돈을 위해 보관하고 있던 돈만 초기화
	public CashRegister(int storageMoney) {
		this.storageMoney = storageMoney;
	}
	
	//넣은 돈을 확인하는 동작
	public void checkAmout(CashRegister cashRegister,Money inputMoney) {
			//넣은 돈의 진위여부를 확인:식별번호가5자리이고 끝 두자리가 32인경우 진짜 돈
			if((inputMoney.getIdentyNum().length()) == 5 && (inputMoney.getIdentyNum().substring(3).equals(32))) {
				this.forgeryCheck = true;
			}
			else System.out.println("위조지폐(돈) 입니다.");
	}	
	//돈을 계산하는 동작,3초 동안 새로운 돈의 투입이 없으면 계산을 중단하고 총 투입금액을 반환(자판기에서 총 투입금액 확인을 위한 스크린 필요)
	public int calculateMoney(VendingMachine vendingmachine) {
		//자판기에 새로운 돈이 투입되지 않을때까지 반복..main에서 처리해보자..ㅠㅠ
		//넣은 돈의 가치를 총 넣은 금액에 더함
		this.totalInputMoney += inputMoney.getValue();
		//초기화 역할도 메인에서 해보자;;
//		//inputMoney초기화;
//		this.inputMoney = null;
//		//forgeryCheck초기화;
//		this.forgeryCheck = false;
		return this.totalInputMoney;//확인 버튼이 눌리면 전체 투입 금액 반환()
	}
	//돈을 저장하는 동작
	//돈을 내보내는 동작
	//다시 넣은 돈을 0으로 초기화 하는 동작
	
}
