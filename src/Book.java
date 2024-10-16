public  class Book {
    String bookCode;
    String name;
    int price;
    String author;

    // Constructor
    public Book() {};
    public Book(String bookCode, String name, int price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    // Getter & Setter
    public String getBookCode() {
        return bookCode;
    }
    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //====== Mini test 2 ======//
    public int getPrice() {
        return price;
    }


    public double getAmount() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    // Amount of books with price > 1000
//    public static void getAmount(Book[] book) {
//        System.out.println("Books' prices more than 1000:");
//        for (int i = 0; i < book.length; i++) {
//            if (book[i].getPrice() > 1000) {
//                System.out.println((i + 1) + ". " + book[i].getName());
//            }
//        }
//
//    }

    // Sum
    public static void getSum(Book[] books) {
        double totalAmount = 0;
        for (Book book : books) {
            totalAmount += book.getAmount();
        }
        System.out.println("Tổng tiền của 6 cuốn sách: " + totalAmount);
    }

    public String getLanguage() {
        return "N/A";  // cai nay e nho ChatGPT a
    }

    public String getCategory() {
        return "N/A";  // cai nay e nho ChatGPT a
    }


}
