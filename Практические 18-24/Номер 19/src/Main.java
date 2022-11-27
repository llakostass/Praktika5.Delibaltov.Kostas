public class Main {
    public static void main(String[] args) {

        User a = new User();
        try {
            a.buy();
        }
        catch(BadINNException e)
        {
            System.err.println(e.getMessage());
        }
    }
}