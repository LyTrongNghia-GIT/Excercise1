/**
 * 
 */

/**
 * Excercise1.6
 * This is a class implemented a Author and this class contains
 * 2 attribute : name, birthyear
 */
public class Author {
    private String name;
    private int birthyear;
    /**
     * 
     * @param name the name of the author
     * @param birthyear the birth year of the author 
     * Ex: 
       + new Author("Harper Lee", 1926);
       + new Author("George Orwell", 1903);
       + new Author("Jane Austen", 1775);
     */
    public Author(String name, int birthyear) {
    	this.name = name;
    	this.birthyear = birthyear;
    }
}
