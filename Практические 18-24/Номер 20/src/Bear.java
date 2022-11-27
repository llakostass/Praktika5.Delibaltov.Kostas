import java.io.Serializable;

public class Bear extends Animal implements Serializable {
    private int SizeOfBerloga;

    public Bear(String name, int sizeOfBerloga) {
        super(name);
        SizeOfBerloga = sizeOfBerloga;
    }
}
