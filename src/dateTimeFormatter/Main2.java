package dateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main2 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, dd, yyyy HH:mm:ss", Locale.US); //локаль можно не указывать
        String format = dateTime.format(formatter);
        System.out.println(format);

        LocalDateTime time = LocalDateTime.of(2005, 5,25,  23, 45);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy год MM месяц dd, HH:mm");
        System.out.println(time.format(formatter1));

    }
}
