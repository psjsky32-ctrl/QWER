package opp;
/**
 * <pre>
 * 판매자
 * 판매자가 판매하는 모든 삼품의 금액은 1000원이다
 * 판매자는 한번에 n개 만큼의 상품을 판매할 수 있다.
 * 판매(5); 라고 한다면 판매자의 상품에서 5개를뺸다
 * 또한 5개를 판매한 금액을 판매자 자본금에 더해야한다
 * 판매자의 재고가없으면 품절되었다
 * 상품의 판매 프로세스가 종료되고 판매자의 재고수 판매자의 자본금을 출력한다
 * </pre>
 */
public class Seller {
	
		int inventory;    
		int money;      
		final int PRICE = 1000; 

		public void sell(int n) {
			if (inventory <= 0) {
				System.out.println("품절되었습니다");
			} else {
				int Sell;
				if (inventory < n) {
					Sell = inventory; 
					inventory = 0;
				} else {
					Sell = n;
					inventory -= n;
				}
				money += (Sell * PRICE);
				
				if(inventory == 0){
					System.out.println("품절 되었습니다");
				}
			}
			
			System.out.println("판매자 남은 재고: " + inventory);
			System.out.println("판매자 자본금: " + money);
		}
}
