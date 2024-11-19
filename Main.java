import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ФИО: ");
        String name = scanner.nextLine();
        System.out.println("Введите дату рождения дд.мм.гггг");
        String birthday = scanner.nextLine();

        GetInitials initials = new GetInitials();
        initials.NameProcessing(name);

        GetAge age = new GetAge();
        age.FindAge(birthday);
    }
}
