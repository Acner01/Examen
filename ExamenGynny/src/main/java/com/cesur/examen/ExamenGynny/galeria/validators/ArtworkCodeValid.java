package com.cesur.examen.ExamenGynny.galeria.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ArtworkCodeValid implements ConstraintValidator<ArtworkCodeValidator, String>{

	private static final Pattern CODE_PATTERN = Pattern.compile("\\b\\w+\\b(\\s+\\b\\w+\\b){4,}");

	@Override
	public void initialize(ArtworkCodeValidator constraintAnnotation) {
	}	

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null) {
//			log.info("Código null");
			return false;
		}
		
		Matcher matcher = CODE_PATTERN.matcher(value);
		//return matcher.matches();
		
		return Pattern.compile("\\b\\w+\\b(\\s+\\b\\w+\\b){4,}").matcher(value).matches(); //directo
	}
}
