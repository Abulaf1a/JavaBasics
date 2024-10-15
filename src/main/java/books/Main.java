package books;



public class Main {

    public static void main(String[] args) {
        Book LOTR = new Book(1216, "Lord of the Rings Paperback");

        System.out.println(LOTR.currentPage + " " + LOTR.title);

        LOTR.turnPage(105);

        System.out.println(LOTR.currentPage + " " + LOTR.title);

        LOTR.turnPage(-1000);

        System.out.println(LOTR.currentPage + " " + LOTR.title);

        LOTR.turnPage(5000);

        System.out.println(LOTR.currentPage + " " + LOTR.title);

        Ebook coolBook = new Ebook(100, "Harry Potter");

        System.out.println(coolBook.currentPage + " " + coolBook.title);

        GraphicNovel Batman = new GraphicNovel(70, "Batman", 100);

        System.out.println(Batman.currentPage + " " + Batman.numberOfPics + " " + Batman.title);

        SheetMusic Mozart = new SheetMusic(25, "Mozart music", "F");

        System.out.println(Mozart.title + " " + Mozart.key);



    }
}
