class Novel extends Book {

    Novel(String title, int id, boolean isAvailable) {
        super(title, id, isAvailable);
    }

    @Override
    void showInfo() {
        System.out.println("Novel Book");
        super.showInfo();
    }
}