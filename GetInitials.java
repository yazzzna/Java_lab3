public class GetInitials {
    public void NameProcessing(String name){

        String[] sep_name = name.split(" ");
        String last_name = sep_name[0];
        String first_name = sep_name[1];
        String patronymic = sep_name[2];
        String initials = last_name + " " + first_name.charAt(0) + "." + patronymic.charAt(0) + ".";
        System.out.println(initials);

        String gender;
        String end = patronymic.charAt(patronymic.length() - 2) + "" + patronymic.charAt(patronymic.length() - 1);
        if (patronymic.endsWith("ов")) {
            gender = "Мужской";
        } else if (patronymic.endsWith("на")) {
            gender = "Женский";
        } else {
            gender = "Определить не удалось";
        }

        System.out.println("Пол: " + gender);
    }
}
