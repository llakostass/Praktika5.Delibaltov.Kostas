import java.util.regex.*;
import java.util.Scanner;

public class User
{
    private String name;
    private String INN;

    public User()
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя");
        this.name = console.nextLine();
        System.out.println("Введите ИНН");
        this.INN = console.nextLine();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", INN='" + INN + '\'' +
                '}';
    }

    public void buy() throws BadINNException
    {
        String regex = "(\\d{12})";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(INN);
        boolean b = m1.matches();
        if (!b) {
            throw new BadINNException("INN is incorrect");
            }
        else {
            System.out.println("Покупка успешна");
        }
    }

}
