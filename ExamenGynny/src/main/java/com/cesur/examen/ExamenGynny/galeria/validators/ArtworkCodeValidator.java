package com.cesur.examen.ExamenGynny.galeria.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;



@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = ArtworkCodeValid.class)
public  @interface ArtworkCodeValidator {

	String message() default "Código inválido." 
			+ " La descripcion tiene menos de 5 palabras debe ser al menos de 5";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
