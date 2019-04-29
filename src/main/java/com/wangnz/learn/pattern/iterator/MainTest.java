package com.wangnz.learn.pattern.iterator;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import com.wangnz.learn.pattern.iterator.impl.BookShelf;

public class MainTest {
	public static void main(String[] args) {

		List<Book> books = new ArrayList<Book>();
		books.add(new Book("book1"));
		books.add(new Book("book2"));
		books.add(new Book("book3"));

		BookShelf bookShelf = new BookShelf(books);

		Iterator it = bookShelf.iterator();

		bookShelf.appendBook(new Book("book4"));
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}

		try {
			String ad8859 = new String("中文".getBytes("UTF-8"), "ISO-8859-1");
			System.out.println(ad8859);
			String code1 = URLEncoder.encode("中文", "UTF-8");
			System.out.println(code1);
			String code2 = URLDecoder.decode(
					"staffNo=117&callback=jQuery31108878965024586511_1491978882225&contractNo=JJD201704124285778115622&aditorNo=117&content=%E6%98%AF%E6%89%93%E5%8F%91%E6%89%93%E5%8F%91%E7%AC%AC%E4%B8%89%E6%96%B900000&aditorName=b%E7%B3%BB%E7%BB%9F%E7%AE%A1%E7%90%86%E5%91%98&_=1491978882228",
					"UTF-8");
			System.out.println(code2);
			String str1 = new String("%E5%8F%91%E7%9A%84%E8%AF%B4%E6%B3%95%E5%A4%A7%E7%A5%9E".getBytes("ISO-8859-1"), "UTF-8");
			System.out.println(str1);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
