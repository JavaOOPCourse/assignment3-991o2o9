public abstract class Service {

    // TODO: declare private fields
    private String serviceName;
    private int serviceId;
    private boolean isActive;


    // TODO: constructor
    public Service(String serviceName, int serviceId){
        this.serviceName = serviceName;
        this.serviceId = serviceId;
        this.isActive = false;
    }


    // TODO: activateService()
    // should set isActive = true
    // print activation message
    public void activateService(){
        isActive = true;
        System.out.println(serviceName + " is set to Active");
    }


    // TODO: deactivateService()
    // should set isActive = false
    // print deactivation message
    public void deactivateService(){
        isActive = false;
        System.out.println(serviceName + " is deactivated");
    }


    // TODO: getter for serviceName
    public String getServiceName(){
        return serviceName;
    }


    // TODO: getter for isActive
    public boolean getIsActive(){
        return isActive;
    }


    // TODO: abstract method performService()
    abstract void performService();

}