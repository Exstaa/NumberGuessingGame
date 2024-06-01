package az.hafizrzazade.numberguessing.entity;

import java.util.Random;

public class NumberEntity {
	private Integer number;
	Random random = new Random();

	public NumberEntity() {
		number = random.nextInt(11);
		// System.out.println(number);
	}

	public Integer getNumber() {
		return number;
	}
}
