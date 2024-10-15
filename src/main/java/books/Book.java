package books;

class Book {

    public int pages;
    public String title;
    public int currentPage;

    public Book(int pages, String title) {
        this.pages = pages;
        this.title = title;
        currentPage = 1;
    }

    Book() {
    }

    public void turnPage(int amount){

        currentPage = currentPage + amount;

        if(currentPage > pages) currentPage = pages;
        else if(currentPage < 1) currentPage = 1;
    }


}
