package com.wangnz.learn.pattern.adapter.impl;

import com.wangnz.learn.pattern.adapter.Banner;
import com.wangnz.learn.pattern.adapter.Print;

public class PrintBanner extends Banner implements Print {

	public PrintBanner(String str) {
		super(str);
	}

	public void printWeak() {
		showWithParen();
	}

	public void printStrong() {
		showWithAster();
	}

}
