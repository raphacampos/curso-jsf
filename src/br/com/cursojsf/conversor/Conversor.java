package br.com.cursojsf.conversor;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("conversor")
public class Conversor implements Converter {

    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        System.out.println("Conversor getAsObject: " + value);
        return value;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        System.out.println("Conversor getAsString: " + value);
        return (String) value;
    }

}