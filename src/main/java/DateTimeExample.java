import java.time.ZonedDateTime;

public class DateTimeExample {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime.getZone());
        System.out.println(zonedDateTime.getOffset());
    }
}
