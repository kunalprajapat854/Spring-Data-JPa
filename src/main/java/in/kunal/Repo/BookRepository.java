package in.kunal.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.kunal.bindings.Book;
import jakarta.transaction.Transactional;
@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
	
//	using findBymethods you can retrieve record from database using non-primary key value .
//	findBybookname methods to find bookname from database .
//	public List<Book> findBybookname (String bookname);
	
//	public Book findByprice (Double price);

// Custom Queries
// HQL 
   @Query("from Book")
   public List<Book> getbooks();
   
   @Query("from Book where bookname = :bookname")
   public Book  findBybookname (String bookname);
   
//   for select query transactional or modifying not required if
//   you write non select query then you have to use these annotations
  
   @Transactional
   @Modifying
   @Query("delete from Book where id= :id")
   public void deleteByid (Integer id);
   
   @Query("from Book where id = :id")
   public Book getbookbyid (Integer id);
   
   @Query("from Book where bookname =:bookname and price=:price")
   public Book findBybooknameAndfindByprice (String bookname , Double price);
   
   
   @Query("from Book where Authorname = :authorname")
    public List<Book> getbyauthor (String authorname);
   
// SQL
   public List<Book> findByPriceGreaterThanEqual(float price);
   
   @Query(" from Book where id=:id")
   public Book deleteid (Integer id);

   
   
   
   

}
