package com;

import model.Payment;
//For REST Service

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Payments")
public class PayManagementService {
	Payment paymentObj = new Payment();

	@GET
	@Path("/Payments")
	@Produces(MediaType.TEXT_HTML)
	public String readItems() {
		return "Hello";
	}
}
