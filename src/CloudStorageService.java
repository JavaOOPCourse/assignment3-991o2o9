public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // TODO: declare premium field
    private boolean premium;


    // TODO: constructor
    public CloudStorageService(String serviceName,int serviceId){
        super(serviceName,serviceId);
        this.premium = false;
    }

    public void performService() {
        if (!getIsActive()) {
            System.out.println("Cloud Storage '" + getServiceName() + "' is currently unavailable");
            return;
        }

        if (premium) {
            System.out.println("(Premium) Synchronizing files at high speed for " + getServiceName());
        } else {
            System.out.println("(Standard) Accessing cloud storage with slow speed " + getServiceName());
        }
    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // enable premium
        // print message
        premium = true;
        System.out.println("You've upgraded to Premium");
    }

    @Override
    public void generateBill() {
        System.out.println("Cloud Storage Bill is being generated for " + getServiceName());
    }
}
