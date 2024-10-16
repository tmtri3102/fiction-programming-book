public class FictionBook extends Book {
    private String category;
    public FictionBook(String bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    // Getter Setter
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Giảm 7%
    @Override
    public double getAmount() {
        return getPrice() * 0.93;
    }

    public static void cheapCount(Book[] books) {
        int cheapFictionCount = 0;
        for (int i = 3; i < books.length; i++) {
            if (books[i].getPrice() < 1000) {
                cheapFictionCount++;
            }
        }
        System.out.println("Số sách FictionBook có giá <1000: " + cheapFictionCount);
    }
}
