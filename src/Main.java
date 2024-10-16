public class Main {
    public static void main(String[] args) {
        // Mini test 1
        /*
        Book book[] = new Book[6];
        book[0] = new Book("0001", "Math", 1200, "Newton");
        book[1] = new Book("0002", "Physics", 800, "O'Reilly");
        book[2] = new Book("0003", "Chemistry", 800, "Einstein");
        book[3] = new Book("0004", "Literature", 1100, "Elon Musk");
        book[4] = new Book("0005", "English", 1300, "Mark Zuckerberg");
        book[5] = new Book("0006", "Biology", 800, "Brian Chesky");

        Book.getSum(book);
        Book.getAmount(book);
        */

        //====== Mini test 2 ======//
        Book[] books = new Book[6];
        books[0] = new ProgrammingBook("PB01", "Java Programming", 1200, "John Doe", "Java", "Spring");
        books[1] = new ProgrammingBook("PB02", "Python Programming", 800, "Jane Doe", "Python", "Flask");
        books[2] = new ProgrammingBook("PB03", "Advanced Java", 1000, "Alice", "Java", "Hibernate");

        books[3] = new FictionBook("FB01", "Fantasy World", 1300, "J.K. Rowling", "Viễn tưởng 1");
        books[4] = new FictionBook("FB02", "Mystery Tales", 800, "Agatha Christie", "Viễn tưởng 1");
        books[5] = new FictionBook("FB03", "Love Story", 950, "Nicholas Sparks", "Romance");

        // Tổng tiền 6 cuốn sách,
        Book.getSum(books);
        // Số FictionBook có giá < 1000
        FictionBook.cheapCount(books);

    // đếm số sách ProgrammingBook có language là "Java" (chua xong)
        int javaCount = 0;
        for (int i = 0; i < 3; i++) { // Chỉ duyệt qua sách ProgrammingBook
            if (books[i].getLanguage().equals("Java")) {
                javaCount++;
            }
        }
        System.out.println("Số sách ProgrammingBook có language là 'Java': " + javaCount);

        // Đếm số sách FictionBook có category là "Viễn tưởng 1" (chua xong)
        int fictionCategoryCount = 0;
        for (int i = 3; i < books.length    ; i++) {
            if (books[i].getCategory().equals("Viễn tưởng 1")) {
                fictionCategoryCount++;
            }
        }
        System.out.println("Số sách FictionBook có category là 'Viễn tưởng 1': " + fictionCategoryCount);


    }




}
