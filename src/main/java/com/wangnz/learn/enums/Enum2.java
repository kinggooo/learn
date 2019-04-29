package com.wangnz.learn.enums;

public enum Enum2 {
	FIRST_AUDIT("待初审", 1), SECOND_AUDIT("待复审", 2);

	private String status;// 状态

	private int value;// 状态值

	private Enum2(String status, int value) {
		this.status = status;
		this.value = value;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// public static TestEnum getStatusByValue(String value) {
	// for (TestEnum status : TestEnum.values()) {
	// if (status.getStatusValue().equals(value)) {
	// return status;
	// }
	// }
	// return null;
	// }

	// @Override
	// public String toString() {
	// return this.status;
	// }

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
