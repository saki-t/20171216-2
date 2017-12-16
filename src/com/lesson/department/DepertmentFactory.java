package com.lesson.department;

public class DepertmentFactory {

	public AbstructDepertment createDepaertment(String code) {
		if (code.equals("1")) {
			return new jinjibu();
		} else if (code.equals("2")) {
			return new jinjibu();
		} else if (code.equals("3")) {
			return new jinjibu();
		}else {
			throw new RuntimeException();
		}
	}
}
