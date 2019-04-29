package com.wangnz.learn.pattern.adapter;

import com.wangnz.learn.pattern.adapter.impl.PrintBanner;
import com.wangnz.learn.pattern.adapter.impl.PrintWithBanner;

public class MainTest {
	public static void main(String[] args) {
		Print print = new PrintBanner("Hello");
		print.printWeak();
		print.printStrong();

		Print print1 = new PrintWithBanner(new Banner("Hello"));
		print1.printWeak();
		print1.printStrong();
	}
}
