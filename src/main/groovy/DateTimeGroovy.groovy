import java.time.ZonedDateTime

/**
 * Created by mj on 17/03/14.
 */
class DateTimeGroovy {

    public static void main(String[] args) {
        def zonedDateTime = ZonedDateTime.now();
        println zonedDateTime.getZone();
        println zonedDateTime.getOffset();

        def date = new Date()
        def instant = date.toInstant()
    }
}
