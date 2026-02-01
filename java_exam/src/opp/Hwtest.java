package opp;

public class Hwtest {
	public static void main(String[] args) {
		
		Seller s = new Seller();
		s.inventory = 10; 
		s.money = 0;

		Buyer b = new Buyer();
		b.wallet = 5000;
		b.weightLimit = 2000;
		b.basketCount = 0;

		System.out.println("판매");
		s.sell(10);
		
		System.out.println("구매");
		b.buy(5);
	}
}
