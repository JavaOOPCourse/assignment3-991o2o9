public class StreamingService extends Service
        implements PremiumFeature {

    // TODO: declare premium field
    private boolean premium;



    // TODO: constructor
    public StreamingService(String serviceName, int serviceInt){
        super(serviceName,serviceInt);
        this.premium = false;
    }


    @Override
    public void performService() {
        if (!getIsActive()) {
            System.out.println(getServiceName() + " is not active.");
            return;
        }

        if (premium) {
            System.out.println("Streaming in 16K Ultra HD with no ads )");
        } else {
            System.out.println("Streaming in 640x480 with ads each 10 seconds (");
        }
    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // set premium = true
        // print message
        premium = true;
        System.out.println("You've upgraded to Premium");
    }
}