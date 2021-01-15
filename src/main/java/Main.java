public class Main {
    public static void main(String[] args) {

        User user = new User("admin", "admin1");
        ServiceProxy service = new ServiceProxy(user);
        service.someBusinessMethodOne();

        User user2 = new User("adminss", "admin1");
        ServiceProxy service2 = new ServiceProxy(user2);
        service2.someBusinessMethodOne();

    }
}
