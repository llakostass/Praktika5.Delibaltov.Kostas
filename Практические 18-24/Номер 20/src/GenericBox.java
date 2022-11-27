import java.io.Serializable;

public class GenericBox<T extends String,K,V extends Animal> {
    private T tt;
    private K key;
    private V value;

    public GenericBox(T tt, K key, V value) {
        this.tt = tt;
        this.key = key;
        this.value = value;
    }

    public T getTt() {
        return tt;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    public void getNameT()
    {
        System.out.println(tt.getClass());
    }
    public void getNameK()
    {
        System.out.println(key.getClass());
    }
    public void getNameV()
    {
        System.out.println(value.getClass());
    }
}
