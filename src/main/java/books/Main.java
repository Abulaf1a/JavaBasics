package books;

import com.sun.source.tree.BlockTree;

public class Main {

    public static void main(String[] args) {
        Book LOTR = new Book(1216, "Lord of the Rings Paperback");

        System.out.println(LOTR.currentPage + " " + LOTR.title);

        LOTR.turnPage(105);

        System.out.println(LOTR.currentPage + " " + LOTR.title);

        LOTR.turnPage(-1000);

        System.out.println(LOTR.currentPage + " " + LOTR.title);

        LOTR.turnPage();



    }
}
