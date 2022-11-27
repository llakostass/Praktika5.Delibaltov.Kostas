package exe3;
public class ThrowsDemo
{
    public void getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("Лох");
        }
        System.out.println("Грамотно");
    }

    public static void main(String[] args) {
        ThrowsDemo A = new ThrowsDemo();
        try {
            A.getDetails("qwdv");
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}