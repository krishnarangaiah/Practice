
package concepts.enums;

import java.util.concurrent.TimeUnit;


public class EnumTest {

	public static void main(String[] args) throws InterruptedException {
		Direction.EAST.getDistance();
	}

}

enum Direction {

	EAST {

		@Override
		public int getDistance() {
			System.out.println("This override");
			return super.getDistance();
		}
	},
	WEST, NORTH, SOUTH;

	private int distance;

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getDistance() {
		return distance;
	}
}
