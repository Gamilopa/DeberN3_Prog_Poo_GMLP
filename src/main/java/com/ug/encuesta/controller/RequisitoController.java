package com.ug.encuesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ug.encuesta.dominio.Requisito;
import com.ug.encuesta.repository.RequisitoRepository;

@RestController
public class RequisitoController {
	@Autowired
private RequisitoRepository requisitoRepository;
	
	@RequestMapping(value="/requisitos",method=RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody Requisito requisito){
		//System.out.println(requisito.getRequisito_id());
		requisitoRepository.save(requisito);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	
	@RequestMapping(value="/requisitos",method=RequestMethod.GET)
	public ResponseEntity<?> findAll(){
		Iterable<Requisito> requisitos=requisitoRepository.findAll();
		return new ResponseEntity<>(requisitos,HttpStatus.OK);
		
		}
	
	@RequestMapping(value="/requisitos/{requisitos_id}",method=RequestMethod.GET)
	public ResponseEntity<?> findOne(@PathVariable int requisito_id){
		Requisito requisitos=requisitoRepository.findOne(requisito_id);
		return new ResponseEntity<>(requisitos,HttpStatus.OK);
		
		}
	
	
}


//hasta ahora no hay error no muevas nada -.-''//pero era de pararla o yo sea reiniciarla asi como hicimos en clase, porque nada mas hiciste cierto XD
//espera un rato ya termino de ejecutar nmo hay error espera un rato!! no quiero AMOR ME TENGO QUE IR A COMPRAR AL CENTRO TE AMO YA LO VOY A GUARDAR SI? TE AMO
//voy con mama amor bello ok amor se me cuidan si ?? ya voY ta cerrar 
//dejame ejecutar rapidito
//oki dejameee!!! amor era eso XD 
//bueno ya voy a salir te cuidas mucho si ? si mi amor te amo :3 chao mi vidta bella t envia saludos rominita
//saluditos para ella tmbn *---* 
// t amo mas!