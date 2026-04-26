class Book {
    String title;
    int id;
    boolean isAvailable;

    Book(String title, int id, boolean isAvailable) {
        this.title = title;
        this.id = id;
        this.isAvailable = isAvailable;
    }

    void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Available: " + isAvailable);
    }
}