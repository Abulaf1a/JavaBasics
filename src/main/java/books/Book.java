package books;

public class Book {

    int pages;
    String title;
    int currentPage;


    public Book(int pages, String title) {
        this.pages = pages;
        this.title = title;
        currentPage = 1;
    }

    public void turnPage(int amount){

        currentPage = currentPage + amount;

        if(currentPage > pages) currentPage = pages;
        else if(currentPage < 1) currentPage = 1;
    }


}
