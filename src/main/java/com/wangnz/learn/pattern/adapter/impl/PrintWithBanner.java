package com.wangnz.learn.pattern.adapter.impl;

import com.wangnz.learn.pattern.adapter.Banner;
import com.wangnz.learn.pattern.adapter.Print;

public class PrintWithBanner implements Print {
	private Banner banner;

	public PrintWithBanner(Banner banner) {
		this.banner = banner;
	}

	public void printWeak() {
		banner.showWithParen();
	}

	public void printStrong() {
		banner.showWithAster();
	}

}
