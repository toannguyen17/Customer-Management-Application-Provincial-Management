package app.service.customer;

import app.model.Customer;
import app.model.Province;

public interface CustomerService {
	Iterable<Customer> findAllByProvince(Province province);
	Iterable<Customer> findAll();
	Customer findById(Long id);
	void save(Customer customer);
	void remove(Long id);
}
