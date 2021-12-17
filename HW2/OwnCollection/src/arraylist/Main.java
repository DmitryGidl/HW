package arraylist;

public class Main {
    public static void main(String[] args) {
        UnmodifiableCollection<String> unmodifiableCollection = new UnmodifiableCollection<>();
        unmodifiableCollection.add("first");
        unmodifiableCollection.add("second");
        unmodifiableCollection.add("third");
        unmodifiableCollection.add("fourth");
        unmodifiableCollection.add("fifth");
        System.out.println(unmodifiableCollection.get(1));
        System.out.println(unmodifiableCollection.get(3));
        System.out.println(unmodifiableCollection.size());
        unmodifiableCollection.delete(2);


    }
}
