package ObjectsFirst;

/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private int pages;
    private String title;
    private String refNumber;
    private int borrowed;
    boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pageNumber, boolean course)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = pageNumber;
        refNumber = "";
        courseText = course;
    }

    public int getpages()
    {
        return pages;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    public String getRefNumber(){
        return refNumber;
    }
    public int getBorrowed()
    {
        return borrowed;
    }
    public boolean isCourseText()
    {
        return courseText;
    }

    public void setRefNumber(String ref){
        if(ref.length()>3){
            refNumber = ref;
        }
        else
        {
            System.out.println("PLease make your ref number large than 3 chars.");
        }
    }
    public void printAuthor()
    {
        System.out.println(author);
    }
    public void printTitle()
    {
        System.out.println(title);
    }
    public void borrow()
    {
        borrowed = borrowed + 1;
    }
    public void printDetails() {
        System.out.println("Author: " + author + "\t Title: " + title + "\tNo of pages: " + pages + "\tNo of times borrowed: "+ borrowed + "\t Is this a course text? "+ courseText);
        if (refNumber.length() > 0)
        {
            System.out.print("Ref num: " + refNumber);
        }
        else
        {
            System.out.println("zzz");
        }
    }

    public static void main(String [] args)
    {
    Book book = new Book("christopher", "the tales of chris",3456,true);
    book.setRefNumber("12xdhdhdh");
    for(int i=0;i<10;i++)
    {
        book.borrow();
    }
    book.printDetails();
    }
}
