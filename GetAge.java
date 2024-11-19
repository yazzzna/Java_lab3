import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class GetAge {
    public void FindAge(String birthday) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate data_now = LocalDate.now();
        LocalDate data_birth = LocalDate.parse(birthday, formatter);
        Period period = Period.between(data_birth, data_now);

        int years = period.getYears();
        if (years % 10 == 1 && years % 100 != 11) {
            System.out.println(years + " год");
        } else if (years % 10 >= 2 && years % 10 <= 4 && (years % 100 < 10 || years % 100 >= 20)) {
            System.out.println(years + " года");
        } else {
            System.out.println(years + " лет");
        }
    }
}
