public class ConsultationService extends Service
        implements Billable {

    // TODO: constructor
    public ConsultationService(String serviceName, int serviceId){
        super(serviceName,serviceId);
    }


    @Override
    public void performService() {

        // TODO:
        // check active
        // print consultation message
        if(!getIsActive()){
            System.out.println("Consultation service " + " " + getServiceName() + " is currently disabled");
            return;
        }
        System.out.println("Expert is now connecting to the client :)");
    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("Consultation Bill is being generated for " + getServiceName());
    }
}
