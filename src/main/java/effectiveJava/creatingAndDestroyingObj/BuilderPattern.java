
package effectiveJava.creatingAndDestroyingObj;


public class BuilderPattern {

	public static void main(String[] args) {

		Hospital hospital = new Hospital.Builder("1", "2").x(3).y(4).build();
		System.out.println(hospital.getName() + " | " + hospital.getAddress() + " | " + hospital.getX() + " | " + hospital.getY());

	}
}


class Hospital {

	// Required
	private String name;
	private String address;

	// Optional
	private int x;
	private int y;


	public static class Builder {

		// Required
		private String name;
		private String address;

		// Optional
		private int x;
		private int y;


		public Builder(String name, String address) {
			this.name = name;
			this.address = address;
		}

		public Builder x(int x) {
			this.x = x;
			return this;
		}

		public Builder y(int y) {
			this.y = y;
			return this;
		}

		public Hospital build() {
			return new Hospital(this);
		}

	}


	public Hospital(Builder builder) {
		this.name = builder.name;
		this.address = builder.address;
		this.x = builder.x;
		this.y = builder.y;
	}


	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


}
