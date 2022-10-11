package sec2.confirm3;
//[ContainerExample.java]
public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<> ();
        container1.set("홍길동", "도적");
        String name = container1.getKey();
        String job = container1.getValue();
        
        Container<String , Integer> container2 = new Container<>();
        container2.set("홍길동", 35);
        String name2 = container2.getKey();
        int age = container2.getValue();
    }
}
//[Container.java]
class Container<K,V> {
    private K key;
    private V value;
    public K getKey() {
        return key;
    }
 
    public V getValue() {
        return value;
    }
    public void set(K key , V value) {
        this.key = key;
        this.value = value;
    }
}