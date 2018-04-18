/*package sample.camel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepository {

	 @Autowired
	  JdbcTemplate jdbcTemplate;
	 /*Spring Jdbc template */
/*	 public int inserttx(TransactionTable t1) {
		 System.out.println("Inside tx insert method");
		    return jdbcTemplate.update("insert into transaction_table (id, name, purpose) " + "values(?,  ?, ?)",
		        new Object[] {
		            t1.getId(), t1.getName(),t1.getPurpose()
		        });
		}

}
*/