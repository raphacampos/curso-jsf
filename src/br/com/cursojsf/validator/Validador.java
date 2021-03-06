package br.com.cursojsf.validator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validador")
public class Validador implements Validator {

    public void validate(FacesContext context, UIComponent component, Object value)
        throws ValidatorException
    {
        System.out.println("Validador validate: " + value);
    }

}