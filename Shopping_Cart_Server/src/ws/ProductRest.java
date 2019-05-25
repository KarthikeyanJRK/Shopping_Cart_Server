package ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import entities.ProductWS;
import model.ProductModel;
//import java.util.*;
//import javax.ws.rs.*;
//import javax.ws.rs.core.*;
//import model.*;

@Path("/product")
public class ProductRest {

	@GET
	@Path("findall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProductWS> findAll(){
	ProductModel productModel = new ProductModel();
	return productModel.findALLWS();
	
	}
	
	
	@GET
	@Path("find")
	@Produces(MediaType.APPLICATION_JSON)
	public ProductWS find(@PathParam("id") Integer id){
	ProductModel productModel = new ProductModel();
	return productModel.findWS(id);
	
	}
}
