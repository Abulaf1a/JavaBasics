package books;

public class SheetMusic extends Book {

    String key;

    SheetMusic(int pages, String title, String key){

        this.pages = pages;
        this.title = title;
        this.key = key;
        currentPage = 1;

    }
}
