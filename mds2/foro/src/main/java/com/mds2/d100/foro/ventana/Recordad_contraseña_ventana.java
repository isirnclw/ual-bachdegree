package com.mds2.d100.foro.ventana;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/**
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed, e.g
 * class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class Recordad_contraseña_ventana extends VerticalLayout {
	protected HorizontalLayout recordar_superior;
	protected HorizontalLayout recordar_mitad;
	protected TextField text_recordar_contraseña_correo;
	protected Label label_correo_error;
	protected TextField text_recordar_contraseña_usuario;
	protected Label label_error_usuario;
	protected Label label_correo_enviado;
	protected Button boton_retroceder_recordar;
	protected Button boton_recordar_aceptar;
	protected HorizontalLayout recordar_inferior;

	public Recordad_contraseña_ventana() {
		Design.read(this);
	}
}
