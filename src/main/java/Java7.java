import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Java7 {


    public static void main(String[] args) {
        String text = "Hello";
        switch (text) {
            case "Hello":
                System.out.println("Hello");
                break;
        }

        List<String> stringList = new ArrayList<>();
        multiCatch();
    }


    static void multiCatch() {
        try {
            throw new FileNotFoundException();
        } catch (IllegalStateException | IOException e) {
            System.out.println(e);
        }
    }
}


