/*package sample.camel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

	 @Autowired
	  JdbcTemplate jdbcTemplate;
	 /*Spring Jdbc template */
/*	 public int insert(BooksTable book) {
		 System.out.println("Inside insert method");
		    return jdbcTemplate.update("insert into books_table (id, item, description) " + "values(?,  ?, ?)",
		        new Object[] {
		            book.getId(), book.getItem(), book.getDescription()
		        });
		}
	//{"id":"4","description":"got","item":"hello"}
	
	
}*/
