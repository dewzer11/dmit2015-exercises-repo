package chinook.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.InvoiceRepository;
import chinook.model.Invoice;


@Model  //alias for @Named/@ManagedBean and @RequestScope
public class InvoiceController {
	
	@Inject
	private InvoiceRepository invoiceRepository;
	
	private List<Invoice> invoices; // getter
	
	@PostConstruct
	void init() {
		invoices = invoiceRepository.findAll();
	}
	
	public List<Invoice> getInvoices() {
		return invoices;
	}
			
}
