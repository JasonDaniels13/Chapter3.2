public class CustomerService implements ICustomerService {


    private static ICustomerValidation customerValidation;
    private static ICustomerStorage customerStorage;

    public CustomerService(ICustomerValidation customerValidation, ICustomerStorage customerStorage){

        this.customerValidation = customerValidation;
        this.customerStorage = customerStorage;

    }
    public  boolean SaveCustomer(Customer customer){

        if(customerValidation.validate(customer)){

            customerStorage.Save(customer);
            return true;
        }
        return false;
    }

}
