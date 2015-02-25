
package concepts.jni;

import java.io.Serializable;


public class Bean implements Serializable {

	private static final long serialVersionUID = 1L;

	private int xint;
	private int yint;

	public int getXint() {
		return xint;
	}

	public void setXint(int xint) {
		this.xint = xint;
	}

	public int getYint() {
		return yint;
	}

	public void setYint(int yint) {
		this.yint = yint;
	}


}