/*package sample.camel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   //creates a table of class name with its private variables as columns 
@Table(name = "books_table")  //we can even mention our own table name
public class BooksTable {
	@Id     //makes this column as primary key 
    private String id;
    private String item;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    @Override
	public String toString() {
		return "BooksTable [id=" + id + ", item=" + item + ", description=" + description + "]";
	}

	public void setDescription(String description) {
        this.description = description;
    }
}*/
