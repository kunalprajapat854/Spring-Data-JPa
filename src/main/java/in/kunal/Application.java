package in.kunal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.kunal.Repo.BookRepository;
import in.kunal.Service.BookService;
import in.kunal.bindings.Book;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(Application.class, args);
		BookService bean = context.getBean(BookService.class);
		System.out.println(bean.getClass().getName());
//		Book book = new Book();
//		
//		book.setId(1);
//		book.setBookname("Core Java");
//		book.setAuthorname("James");
//		book.setPrice(465.0);                  
//		
//		bean.save(book);
//		bean.saveuser();
		bean.multipleuser();
//		bean.findbyid(1);
//		bean.findbyallbook();
//		bean.bookavilable(1);
//		bean.findbyallbook();
//		bean.deleteuser(6);
		
//		own method findbyname
//		bean.findname("Core Java");
		
//		own method findbyprice
//		bean.findprice(499.0);
		
//      HQL Queary
//		bean.listbook();
//		bean.findbookname("Good Vibes");
//		bean.deleteid(7);
//		bean.findbybookandprice("Core Java", 465.0);
//		bean.findbyid(1);
		
//		SQL Queary
//		bean.findprice(457.0);
//		bean.findprice(460);
//		bean.getauthorname("James");
//		bean.deleteid(4);
		
	}

}
