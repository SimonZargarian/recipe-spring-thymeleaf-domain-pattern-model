package com.kokabmedia.recipe.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * This class will handle the modelling of the database tables and also function as model for 
 * communication between the database and this application.
 * 
 * It will also act as a model class for values bounded to the HTML view file properties.
 * 
 * Getter and Setter methods and constructors of this class is provided with the Lombok framework. 
 * Getter setter methods and  constructors will be automatically generated by Lombok framework 
 * under the hood.
 */
@Getter
@Setter
/* 
 * The @Entity annotation from javax.persistence enables the JPA framework to manage 
 * the UnitOfMeasure class as a JPA entity. The UnitOfMeasure class is an entity and 
 * will be  mapped to a database table with the name UnitOfMeasure. 
 * 
 * The @Entity annotation will automatically with Hibernate, JPA and Spring auto 
 * configuration create a UnitOfMeasure table in the database.
 */
@Entity
public class UnitOfMeasure {

	/* 
	 * The @Id annotation makes this field a primary key in the database table.
	 * 
	 * The @GeneratedValue annotation makes the Hibernate generate the primary key value.
	 * 
	 * The GenerationType.IDENTITY parameter indicates that the id will be generated by the
	 * database.
	 * 
	 * Primary key will uniquely identify each row in a database table.
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
}