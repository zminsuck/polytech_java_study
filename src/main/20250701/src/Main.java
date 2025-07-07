public class Main {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("A", LocalDate.of(2024, 1, 1)));
        list.add(new Book("B", LocalDate.of(2022, 1, 1)));
        list.add(new Book("C", LocalDate.of(2023, 1, 1)));

        Collections.sort(list);
        list.forEach(System.out::println); // 최신 → 오래된 순 출력

        Set<Book> set = new HashSet<>();
        set.add(new Book("A", LocalDate.of(2024, 1, 1)));
        set.add(new Book("A", LocalDate.of(2024, 1, 1)));
        System.out.println("Set size = " + set.size()); // 중복 제거됨 → 1

        Book b1 = new Book("CloneTest", LocalDate.now());
        Book b2 = b1.clone();
        System.out.println("복사본: " + b2);
    }
}
