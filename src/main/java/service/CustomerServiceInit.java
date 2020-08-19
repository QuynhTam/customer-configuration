package service;

import service.impl.CustomerServiceImpl;

public class CustomerServiceInit {
    private static CustomerService customerService;

    public static synchronized CustomerService getInstance() {
        if (customerService == null)
            customerService = new CustomerServiceImpl();
        return customerService;
    }
}
