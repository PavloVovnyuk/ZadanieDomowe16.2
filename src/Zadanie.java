import java.time.LocalDateTime;
import java.util.Scanner;

public class Zadanie {

    private String treśćZadania;
    private LocalDateTime data;

    public Zadanie(String treśćZadania, LocalDateTime data) {
        this.treśćZadania = treśćZadania;
        this.data = data;
    }

    public String getTreśćZadania() {
        return treśćZadania;
    }

    public void setTreśćZadania(String treśćZadania) {
        this.treśćZadania = treśćZadania;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Zadanie{" +
                "treśćZadania=" + treśćZadania +
                ", data=" + data +
                '}';
    }
}



