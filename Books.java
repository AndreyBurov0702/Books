public class Books {
    String title;
    String author;
}
class BookTestDrive{
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[0].title = "Плоды Java";
        myBooks[1].title = "Java Гэтсби";
        myBooks[2].title = "Сборник рецептов по Java";

        myBooks[0].author = "Боб";
        myBooks[1].author = "Сью";
        myBooks[2].author = "Ян";

        while (x < 3){
            System.out.println(myBooks[x].title);
            System.out.println(", автор");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
