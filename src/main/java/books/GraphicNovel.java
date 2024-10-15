package books;

public class GraphicNovel extends Book {

    int numberOfPics;

    public GraphicNovel(int pages, String title, int numberOfPics) {
        this.pages = pages;
        this.title = title;
        this.numberOfPics = numberOfPics;
        currentPage = 1;

    }
}
