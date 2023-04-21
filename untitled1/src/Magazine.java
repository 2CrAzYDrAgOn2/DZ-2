class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    // Реализуем метод print() для класса Magazine
    public void print() {
        System.out.println("Magazine: " + title);
    }

    // Статический метод для вывода на консоль названий только журналов
    public static void printMagazines(Printable[] printable) {
        System.out.println("\nMagazines:");
        for (Printable p : printable) {
            if (p instanceof Magazine) {
                System.out.println(((Magazine) p).title);
            }
        }
    }
}
