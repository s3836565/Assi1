package Controller;
import model.Customer;
import view.CustomerView;

public class CustomerController {
    private Customer model;
    private CustomerView view;

    public CustomerController(Customer model, CustomerView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.printCustomerDetails(model.getId_cus(), model.getInsuranceCard().toString());
    }
}
