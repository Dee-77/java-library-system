class TextBook extends Book {

    TextBook(String title, int id, boolean isAvailable) {
        super(title, id, isAvailable);
    }

    @Override
    void showInfo() {
        System.out.println(" TextBook");
        super.showInfo();
    }
}