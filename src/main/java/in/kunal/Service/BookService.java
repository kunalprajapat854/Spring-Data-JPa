package in.kunal.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kunal.Repo.BookRepository;
import in.kunal.bindings.Book;

@Service
public class BookService {
	
    @Autowired
	private BookRepository bookrepo;
	
	public void saveuser() {
		Book book = new Book();
		book.setBookname("C++");
		book.setPrice(457.0);
		book.setAuthorname("Rose");
		bookrepo.save(book);
	}
	
	public void multipleuser() {
		Book b = new Book();
		b.setAuthorname("Vex King");
		b.setBookname("Good Vibes");
		b.setPrice(499.0);
		
		Book e = new Book();
		e.setAuthorname("$$");
		e.setBookname("Springboot");
		e.setPrice(699.0);
		
	    List<Book> booklist =  Arrays.asList(b, e);
	    bookrepo.saveAll(booklist);
	
	}
	
	
//	public void findbyid (Integer id) {
//	    Optional<Book> book = bookrepo.findById(id);
//	    if (book.isPresent()) {
//			Book b = book.get();
//			System.out.println(b);
//		} 
//	}
	
	public void findbyallbook() {
     List<Integer>  booklist = Arrays.asList(1,3,4,5);
      Iterable<Book>  book = bookrepo.findAllById(booklist);
       book.forEach(System.out::println);
	}
	
	public void deleteuser(Integer id) {
		 bookrepo.deleteById(id);
		
	}
	
//	public List<Book> findname(String bookname) {
//		List<Book> book = bookrepo.findBybookname(bookname);
//		System.out.println(book);
//	   return book;
//	}
	
//	public Book findprice (Double price) {
//		Book book = bookrepo.findByprice(price);
//		System.out.println(book);
//		return  book;
//	}
	
//	HQL Query Methods 
	
	public List<Book> listbook(){
	  List<Book> list = bookrepo.getbooks();
	  list.forEach(System.out::println);
	  return list;
	}
	
	public Book findbookname(String bookname) {
	  Book book = bookrepo.findBybookname(bookname);
		System.out.println(book);
		return book;
	}
	
	 public void deleteid(Integer id) {
	       bookrepo.deleteByid(id);
	 
	}
	 public Book findbybookandprice(String bookname, Double price) {
		 Book book = bookrepo.findBybooknameAndfindByprice(bookname, price);
		 System.out.println(book);
		 return book;
	 }
	 
	 public Book findbyid (Integer id) {
		Book book = bookrepo.getbookbyid(id);
		System.out.println(book);
		return book;
	 }
	
//	SQL
	public List<Book> findprice (float price) {
		List<Book> book = bookrepo.findByPriceGreaterThanEqual(price);
		book.forEach(System.out::println);
		  return book;
	}
	
//	own queary
	public List<Book> getauthorname(String authorname){
		List<Book> b1 = bookrepo.getbyauthor(authorname);
		b1.forEach(System.out::println);
		return b1;
				
	}
	
	public void delete (Integer id) {
		bookrepo.deleteid(id);
	}	

   
	
	
	
	
	
}
