package com.wangnz.learn.pattern.iterator.impl;

import com.wangnz.learn.pattern.iterator.Book;
import com.wangnz.learn.pattern.iterator.Iterator;

public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;

	private int index;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		index = 0;
	}

	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		}
		return false;
	}

	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
