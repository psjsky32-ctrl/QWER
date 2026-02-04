package hw.mart;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {
	//제품들을 저장할 리스트를 만든다
	private List<Item> items;
	
	public Store() {
		this.items = new ArrayList<>();
	}

	public void add(Item item) {
		this.items.add(item);
	}

	public void sell(int index) {
		/**
		 * index에 할당되어있는 제품의 소비기한이 당일이라면 "오늘까지 드세요" 를 출력
		 * 
		 * 소비기한이 3일 내에 도래한다면 "가능한 빨리 드세요"를 출력
		 * 
		 * 소비기한이 지났다면 "소비기한이 지나 판매하지 않습니다" 를 출력
		 * 
		 */
		Item item = items.get(index);
		LocalDate today = LocalDate.now();
		LocalDate expireDate = item.getExpireDate();

		if (expireDate.isBefore(today)) {
			System.out.println("소비기한이 지나 판매하지 않습니다");
		} else if (expireDate.equals(today)) {
			System.out.println("오늘까지 드세요");
		} else if (expireDate.isBefore(today.plusDays(4))) {
			System.out.println("빨리 드세요");
		} else {
			System.out.println("많이남음");
		}
	}
}