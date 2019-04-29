package com.wangnz.learn.pattern.iterator.impl;

import java.util.List;

import com.wangnz.learn.pattern.iterator.Aggregate;
import com.wangnz.learn.pattern.iterator.Book;
import com.wangnz.learn.pattern.iterator.Iterator;

public class BookShelf implements Aggregate {
	private List<Book> books;

	public BookShelf(List<Book> books) {
		this.books = books;
	}

	public void appendBook(Book book) {
		this.books.add(book);
	}

	public int getLength() {
		return books.size();
	}

	public Book getBookAt(int index) {
		return books.get(index);
	}

	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}