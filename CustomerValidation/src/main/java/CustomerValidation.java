public class CustomerValidation implements ICustomerValidation {

    public boolean validate(Customer customer){
        if ((customer.name).isEmpty())
        {
            return false;
        }
        if ((customer.surname).isEmpty())
        {
            return false;
        }
        return true;



    }
}
