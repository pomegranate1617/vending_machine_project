package vending_machine;

public class Money {
	//돈의 단위,형태,식별번호는 변하지 않으니까 final사용
	private final int value;//돈의 단위(10,50,100,1000,10000);
//	private final String shape;//돈의 형태 (지폐인가,동전인가)
	private final String identyNum;//돈의 식별 번호(위조방지?)
	//총5자리 숫자로 구성되고,마지막 두숫자에 32가 들어가는지
	
	
//	public Money(int value,String shape,int identyNum) {
//		this.value = value;
//		this.shape = shape;
//		this.identyNum = identyNum;
//	}
	public Money(int value,String identyNum) {
		this.value = value;
		this.identyNum = identyNum;
	}
	
	//돈의 행동이 있나...?없는거 같은데;;
	//자판기에 돈을 넣으면 넣은 금액이 올라가는거에 영향을 미치나?근데 이건 돈의 영역이 아닌데...
	//돈의 단위를 내보내는 동작?;;
	public int getValue() {
		return this.value;
	}
	//돈의 식별 번호를 내보냄.
	public String getIdentyNum() {
		return this.identyNum;
	}
	 
	
}
