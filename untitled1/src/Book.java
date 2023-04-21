class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    // Реализуем метод print() для класса Book
    public void print() {
        System.out.println("Book: " + title);
    }

    // Статический метод для вывода на консоль названий только книг
    public static void printBooks(Printable[] printable) {
        System.out.println("\nBooks:");
        for (Printable p : printable) {
            if (p instanceof Book) {
                System.out.println(((Book) p).title);
            }
        }
    }
}
