package chinook.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.InvoiceLineRepository;
import chinook.model.InvoiceLine;


@Model  //alias for @Named/@ManagedBean and @RequestScope
public class InvoiceLineController {
	
	@Inject
	private InvoiceLineRepository invoicelineRepository;
	
	private List<InvoiceLine> invoicelines; // getter
	
	@PostConstruct
	void init() {
		invoicelines = invoicelineRepository.findAll();
	}
	
	public List<InvoiceLine> getInvoiceLine() {
		return invoicelines;
	}
			
}
