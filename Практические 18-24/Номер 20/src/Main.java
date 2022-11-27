public class Main {
    public static void main(String[] args)
    {
        GenericBox<String,Integer,Bear> a = new GenericBox<>("qwer",228,new Bear("Oleg",100));
        System.out.println(a.getKey());
        a.getNameK();
    }
}