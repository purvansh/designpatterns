public class SingletonMain {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance("Hello");
        Singleton s1 = Singleton.getInstance("Hello2");
        System.out.println(s1.getString());
        System.out.println(s.getString());    
    }
}
