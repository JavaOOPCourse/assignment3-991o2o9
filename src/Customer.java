public class Customer extends User {

    // TODO: constructor
    public Customer(String name, int id){
        super(name,id);
    }


    @Override
    public void manageService(Service s) {
        // TODO:
        // print that customer cannot manage services
        System.out.println("(ERROR) User " + getName() + " does not have permission to manage " + s.getServiceName());
    }

    @Override
    public void useService(Service s) {

        // TODO:
        // print customer using message
        // call performService()
        System.out.println("Customer " + getName() + " is now using: " + s.getServiceName());
        s.performService();
    }
}