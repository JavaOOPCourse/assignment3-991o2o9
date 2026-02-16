public class Admin extends User {

    // TODO: constructor
    public Admin(String name, int id){
        super(name,id);
    }


    @Override
    public void manageService(Service s) {

        // TODO:
        // print admin managing message
        System.out.println("(SUCCESS) User " + getName() + " is now configuring the service: " + s.getServiceName());
    }

    @Override
    public void useService(Service s) {

        // TODO:
        // print admin using message
        // call performService()
        System.out.println("Admin " + getName() + " is running service diagnostics");
        s.performService();
    }
}