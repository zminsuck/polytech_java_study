import java.util.*;

public class BookTest {
    public static void main(String[] args) {
        // 날짜 준비
        Date date1 = new GregorianCalendar(2024, Calendar.JANUARY, 1).getTime();
        Date date2 = new GregorianCalendar(2025, Calendar.MARCH, 10).getTime();

        // Book 객체 생성
        Book b1 = new Book();
        b1.title = "C언어";
        b1.publishDate = date1;
        b1.comment = "기본서";

        Book b2 = new Book();
        b2.title = "C언어";
        b2.publishDate = date1;
        b2.comment = "다른 설명";

        // equals 테스트
        System.out.println("equals: " + b1.equals(b2)); // true (title + date 같음)

        // clone 테스트
        Book b3 = b1.clone();
        System.out.println("clone equals: " + b1.equals(b3)); // true
        System.out.println("clone == : " + (b1 == b3));        // false

        // 정렬 테스트
        Book b4 = new Book();
        b4.title = "C언어";
        b4.publishDate = date2;
        b4.comment = "신간";

        List<Book> list = new ArrayList<>();
        list.add(b1);
        list.add(b4);

        Collections.sort(list); // 최신순 정렬

        System.out.println("정렬 결과:");
        for (Book b : list) {
            System.out.println(b);
        }

        // Set 중복 테스트
        Set<Book> set = new HashSet<>();
        set.add(b1);
        set.add(b2); // 동일 객체로 간주됨
        System.out.println("Set 크기: " + set.size()); // 1
    }
}
