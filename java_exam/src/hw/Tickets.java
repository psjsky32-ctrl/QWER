package hw;

public class Tickets {
	private int seatNumber;
	private boolean reserve;

	public Tickets(int seatNumber, boolean reserve) {
		this.seatNumber = seatNumber;
		this.reserve = reserve;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public boolean isReserve() {
		return reserve;
	}

	public void setReserve(boolean reserve) {
		this.reserve = reserve;
	}

	@Override
	public String toString() {
		return seatNumber + ": " + (reserve ? "X" : "O");
	}
}