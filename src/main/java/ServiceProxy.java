public class ServiceProxy implements Service {
    private RealService realService;
    private User user;

    public ServiceProxy(User user) {
        this.user = user;
    }

    @Override
    public void someBusinessMethodOne() {
        if (user.getLogin().equalsIgnoreCase("admin") && user.getPassword().equalsIgnoreCase("admin1")) {
            Service realObject = new RealService();
            realObject.someBusinessMethodOne();
        } else {
            System.out.println("Wrong login or password!");

        }


    }
}
