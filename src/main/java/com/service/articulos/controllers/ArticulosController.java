package com.service.articulos.controllers;


import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service.articulos.models.Articulos;
import com.service.articulos.repositories.ArticulosRepository;

@Component
@Path("/articulos")
public class ArticulosController {

	@Autowired
	ArticulosRepository articulosRepository;
	
	@GET
	@Path("/get")
    @Produces("application/json")
	public Response getAll() {
		return Response.status(200).entity(articulosRepository.findAll()).build();
	}
	
	@POST
	@Path("/save")
	@Produces("application/json")
	@Consumes("application/json")
	public Response save(Articulos articulo){
		return Response.status(200).entity(articulosRepository.save(articulo).getIdArticulo()).build();
	}

	@GET
	@Path("/get/{id}")
	@Produces("application/json")
	public Response getById(@PathParam("id") long id){
		return Response.status(200).entity(articulosRepository.findById(id)).build();
	}
	
	@DELETE
	@Path("/delete/{id}")
	public Response deleteById(@PathParam("id") long id) {
		articulosRepository.deleteById(id);
		return Response.status(200).entity("OK").build();
	}
	
	@PUT
	@Path("/update")
	@Produces("application/json")
	@Consumes("application/json")
	public Response update(Articulos articulo){
		return Response.status(200).entity(articulosRepository.save(articulo).getIdArticulo()).build();
	}
}
