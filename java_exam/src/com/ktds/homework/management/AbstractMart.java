package com.ktds.homework.management;

/**
 * public class Name : 인스턴스로 생성할 수 있는 일반클래스 정의
 * public abstract class Name : 인스턴스로 생성할 수 없는 추상 클래스 정의
 */
public abstract class AbstractMart {
	
	private int safe;
	private int productPrice;
	private int remainmoney;//고객에게 거슬러 줄 돈
	
	public AbstractMart(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public void sell(Guest guest, int sellCount, int money) {
	    int amount = sellCount * this.productPrice; 
	    amount -= this.discount(guest, amount);    

	    int wantedUsePoint = this.usePoint(guest); 
	    
	    // [중요] 4. 음수 방지: 결제 금액보다 포인트가 많으면 결제 금액만큼만 사용
	    int actualPointUsed = Math.min(amount, wantedUsePoint);
	    

	    int finalPrice = amount - actualPointUsed; 

	    if (money < finalPrice) {
	        System.out.println("돈이 모자랍니다. 최종 결제액: " + finalPrice);
	        return;
	    }

	    guest.pay(money); 
	    this.givePoint(guest, amount); 

	    this.remainmoney = money - finalPrice; 
	    this.safe += finalPrice; 
	    
	    System.out.println("최종 결제 금액: " + finalPrice);
	    System.out.println("매출액: " + this.safe);
	    System.out.println("거슬러 줄 돈: " + this.remainmoney);
	    System.out.println();

	    guest.giveMoney(this.remainmoney);
	    this.remainmoney = 0;
	}
	
	public abstract int usePoint(Guest guest);//메소드를 정의만한다. 
	
	public abstract void givePoint(Guest guest, int amount);
	
	public abstract int discount(Guest guest, int amount);
	
	
}