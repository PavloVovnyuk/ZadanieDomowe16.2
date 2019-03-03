import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        TworzeniaZadan tworzeniaZadan = new TworzeniaZadan();
        tworzeniaZadan.przeszleZadania();
        tworzeniaZadan.przyszleZadania();
        tworzeniaZadan.zadaniaDoWykonania24();
        tworzeniaZadan.zadaniaDoWykonaniaWTygodniu();
        tworzeniaZadan.zadaniaDoWykonaniaWMiesiacu();
    }
}
