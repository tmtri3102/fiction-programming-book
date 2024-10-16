public class ProgrammingBook extends Book {
    private String language;
    private String framework;
    ProgrammingBook() {}    ;
    public ProgrammingBook(String bookCode, String name, int price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    // Getter Setter
    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }


        public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    // Giảm 5%
    @Override
    public double getAmount() {
        return getPrice() * 0.95;
    }

}
