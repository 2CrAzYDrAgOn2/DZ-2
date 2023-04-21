public class Main {
    public static void main(String[] args) {
        // Создаем массив объектов типа Printable, который содержит книги и журналы
        Printable[] printables = {new Book("The Great Gatsby"), new Magazine("Time"), new Book("To Kill a Mockingbird")};

        // Вызываем метод print() для каждого объекта в массиве
        for (Printable printable : printables) {
            printable.print();
        }

        // Вызываем статические методы для вывода на консоль названий только журналов и только книг
        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}
