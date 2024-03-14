public class Main {
    public static void main(String[] args) {

        MP3 mp3 = new MP3("Ngay mai", "Bài hát", "NM1122", 12.3f,23);
        System.out.println("Thông tin của MP3: ");
        mp3.showInfo();

        Book book = new Book("Harry Potter","Tiểu thuyết", "1123", 34.5f,"J.K.Rowling", 200, "Detective");
        System.out.println("Thông tin của sách: ");
        book.showInfo();

    }
}
