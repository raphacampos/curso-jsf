package br.com.cursojsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.event.ValueChangeEvent;
@ManagedBean
@RequestScoped 
public class Bean implements ActionListener {

    // Init ----------------------------------------------------------------------------------------

    private HtmlInputText inputComponent;
    private String inputValue;
    private HtmlOutputText outputComponent;
    private String outputValue;

    private HtmlInputText novoTexto;
    private String texto;
    
    // Constructors -------------------------------------------------------------------------------

    public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setOutputValue(String outputValue) {
		this.outputValue = outputValue;
	}

	public HtmlInputText getNovoTexto() {
		return novoTexto;
	}

	public void setNovoTexto(HtmlInputText novoTexto) {
		this.novoTexto = novoTexto;
	}

	public Bean() {
        log("constructed");
    }

    // Actions ------------------------------------------------------------------------------------

    public void inputChanged(ValueChangeEvent event) {
        log(event.getOldValue() + " to " + event.getNewValue());
    }

    public void action() {
        outputValue = inputValue;
        log("succes");
    }

    // Getters/setters ----------------------------------------------------------------------------

    public HtmlInputText getInputComponent() {
        log(inputComponent);
        return inputComponent;
    }

    public void setInputComponent(HtmlInputText inputComponent) {
        log(inputComponent);
        this.inputComponent = inputComponent;
    }

    public String getInputValue() {
        log(inputValue);
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        log(inputValue);
        this.inputValue = inputValue;
    }

    public HtmlOutputText getOutputComponent() {
        log(outputComponent);
        return outputComponent;
    }

    public void setOutputComponent(HtmlOutputText outputComponent) {
        log(outputComponent);
        this.outputComponent = outputComponent;
    }

    public String getOutputValue() {
        log(outputValue);
        return outputValue;
    }

    // Helpers ------------------------------------------------------------------------------------

    private void log(Object object) {
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println("Bean " + methodName + ": " + object);
    }
    
    public void novoMetodo(){    
    	System.out.println("novoMetodo");    	
    }
    
	public void metodoListener(ActionEvent e){    	
    	System.out.println("metodoListener");    	
    }

	@Override
	public void processAction(ActionEvent arg0) throws AbortProcessingException {
		// TODO Auto-generated method stub
		
	}
    
 
    
}