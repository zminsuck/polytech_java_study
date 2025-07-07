import java.util.*;

public class Book implements Comparable<Book>, Cloneable {

    public String title; // 책 제목

    public Date publishDate; // 출간일

    public String comment; // 코멘트

    @Override
    public Book clone() {
        Book result = new Book(); // 새로운 Book 객체 생성

        result.title = this.title;
        result.comment = this.comment;
        result.publishDate = (Date) this.publishDate.clone();

        return result; // 복사 결과 반환
    }

    @Override
    public int compareTo(Book other) { // 내림차 순 정렬
        return other.publishDate.compareTo(this.publishDate);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Book b) {
            return title.equals(b.title) && publishDate.equals(b.publishDate);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishDate);
    }

    @Override
    public String toString() {
        // 제목 (출간일) - 보기 좋게 출력
        return title + " (" + publishDate + ") - " + comment;
    }
}
