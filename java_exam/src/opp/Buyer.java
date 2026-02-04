package opp;

public class Buyer {
	
	int wallet;           
	int basketCount;      
	int weightLimit;   
	final int ITEMWEIGHT = 500;
	final int PRICE = 1000;

	public void buy(int n) {
		int Weight = basketCount * ITEMWEIGHT;
		int nextWeight = (basketCount + n) * ITEMWEIGHT;

		if (nextWeight > weightLimit) {
			System.out.println("더 이상 장바구니를 들 수 없습니다");
		} else if (wallet < n * PRICE) {
			System.out.println("돈이 부족합니다");
		} else {
			basketCount += n;
			wallet -= (n * PRICE);
		}

		System.out.println("구매자 상품 수: " + basketCount);
		System.out.println("장바구니 무게: " + (basketCount * ITEMWEIGHT) + "g");
		System.out.println("지갑의 돈: " + wallet);
	}
}
