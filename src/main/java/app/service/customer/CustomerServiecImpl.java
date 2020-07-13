package app.service.customer;

import app.model.Customer;
import app.model.Province;
import app.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiecImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Iterable<Customer> findAllByProvince(Province province) {
		return customerRepository.findAllByProvince(province);
	}

	@Override
	public Iterable<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Customer findById(Long id) {
		return customerRepository.findOne(id);
	}

	@Override
	public void save(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public void remove(Long id) {
		customerRepository.delete(id);
	}
}
