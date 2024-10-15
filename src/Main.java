public class Main {
    public static void main(String[] args) {
        Book book[] = new Book[6];
        book[0] = new Book("0001", "Math", 1200, "Penguin");
        book[1] = new Book("0002", "Physics", 800, "O'Reilly");
        book[2] = new Book("0003", "Chemistry", 800, "Manning");
        book[3] = new Book("0004", "Literature", 1100, "New York Times");
        book[4] = new Book("0005", "English", 1300, "Penguin");
        book[5] = new Book("0006", "Biology", 800, "WSJ");

        System.out.println("Type of book: ");
        for (int i = 0; i < book.length; i++) {
            System.out.println((i + 1) + ". Code: " + book[i].getBookCode()
                    + " - Name: " + book[i].getName()
                    + " - Price: " + book[i].getPrice()
                    + " - Author: " + book[i].getAuthor());
        }

        int sum = 0;
        for (Book x: book) {
            sum += x.getPrice();
        }
        System.out.println("Total price " + book.length + " of the book is " + sum);

        System.out.println("Books' prices more than 1000:");
        for (int i = 0; i < book.length; i++) {
            if (book[i].getPrice() > 1000) {
                System.out.println((i + 1) + ". " + book[i].getName());
            }
        }
    }
}
