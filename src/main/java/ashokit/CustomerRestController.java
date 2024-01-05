package ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

	@DeleteMapping(value = "/customer/{cid}", produces = "text/plain")
	public String deleteCustomer(@PathVariable Integer cid) {
		// db logic to delete
		return cid + "  Customer Deleted";
	}

	@PutMapping(value = "/customer", consumes = "application/json", produces = "text/plain")
	public String updateCustomer(@RequestBody Customer c) {
		System.out.println(c);
		// TODO: DB logic to update the record
		return "Customer Updated";
	}

	@PostMapping(value = "/customer", produces = "text/plain", consumes = "application/json")
	public ResponseEntity<String> addCustomer1(@RequestBody Customer c) {
		System.out.println(c);
		// TODO: DB logic to insert record
		String body = "Customer Added";
		return new ResponseEntity<>(body, HttpStatus.CREATED);
	}

	@DeleteMapping("/del")
	public String delete() {

		return "Deleted";

	}

	@PutMapping("/up")
	public String update() {
		return "updated";

	}

	@PostMapping("/add")
	public String addCustomer(@RequestBody Customer c) {

		System.out.println("Cistomer Added");

		return "Customer Added";

	}

	@GetMapping("/customer")
	public Customer getCustomer() {

		Customer c = new Customer(1, "Narendra", "mnr2@gmail.com");

		return c;
	}

	@GetMapping("/customers")
	public List<Customer> getCustomers() {

		Customer c = new Customer(1, "Narendra", "mnr2@gmail.com");
		Customer c1 = new Customer(1, "Marendra", "mnr2@gmail.com");

		Customer c2 = new Customer(1, "Surendra", "mnr2@gmail.com");

		List<Customer> l = Arrays.asList(c, c1, c2);

		return l;
	}

}
