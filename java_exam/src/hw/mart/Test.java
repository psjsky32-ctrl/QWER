package hw.mart;

public class Test {
	public static void main(String[] args) {
		// 1. 마트 객체 생성
		Store mart = new Store();

		mart.add(new Item("고구마돈까스", "2026-02-01"));
		mart.add(new Item("김치돈까스", "2026-02-04"));
		mart.add(new Item("돈까스", "2026-02-06"));
		mart.add(new Item("치즈돈까스", "2027-12-31"));

		System.out.println("=== 마트 확인 및 판매 ===");

		System.out.print("고구마돈까스: ");
		mart.sell(0);

		System.out.print("김치돈까스: ");
		mart.sell(1);

		System.out.print("돈까스: ");
		mart.sell(2);

		System.out.print("치즈돈까스: ");
		mart.sell(3);
	}
}