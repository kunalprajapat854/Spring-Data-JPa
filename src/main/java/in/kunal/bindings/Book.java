package in.kunal.bindings;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Book_Info")
public class Book {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "Book_Name")
	private String bookname;
	
	@Column(name = "Author_Name")
	private String Authorname;
	
	@Column(name = "Price")
	private Double price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthorname() {
		return Authorname;
	}

	public void setAuthorname(String authorname) {
		Authorname = authorname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	
	public String toString() {
		return "Book [id=" + id + ", bookname=" + bookname + ", Authorname=" + Authorname + ", price=" + price
				+ ", getId()=" + getId() + ", getBookname()=" + getBookname() + ", getAuthorname()=" + getAuthorname()
				+ ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
