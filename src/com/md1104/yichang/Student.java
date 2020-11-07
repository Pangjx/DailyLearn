package com.md1104.yichang;

public class Student {
	private int id;

	public void regist(int id) throws Exception {
		if (id > 0) {
			this.id = id;
		} else {
			throw new RuntimeException("不能出现负数");
		}
	}

	public String toString() {
		return "Student [id=" + id + "]";
	}
}
