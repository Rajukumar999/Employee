package com.rest.employee;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javassist.NotFoundException;

import javax.ws.rs.PathParam;

@Path("/employees")
public class EmployeeResource {

	 private EmployeeService userService = new EmployeeService();
	 @GET
	    @Path("emp/{id}")
	    @Produces(MediaType.APPLICATION_JSON)
	    public Employee get(@PathParam("id") String id) throws NotFoundException {
	        return userService.get(id);
	    }
	 
	 		@POST
	    @Produces(MediaType.APPLICATION_JSON)
	    @Consumes(MediaType.APPLICATION_JSON)
	    public void create(Employee emp) {
	        // create notification
	        userService.create(emp);
	        
	    }
	 		
	 		@PUT
	 	    @Path("/emp/{id}")
	 	    @Consumes(MediaType.APPLICATION_JSON)
	 	    public void update(@PathParam("id") String id, Employee emp) {
	 	        userService.update(emp);
	 	    }	
	 		
	 		@DELETE
	 	    @Path("/emp/{id}")
	 	    public void delete(@PathParam("id") String id) throws NotFoundException {
	 	        userService.delete(id);
	 	        
	 	    }
	
		 		
	 		@GET
	 		@Path("/emp/empSalary/{id}")
		    public String getTax(@PathParam("id") String id) throws NotFoundException {
		        return userService.getTax(id);
		    }
		 

	 
	
	
}
