package com.mds2.d100.foro.ventana;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextArea;
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
public class Registrarse_ventana extends VerticalLayout {
	protected HorizontalLayout registrarse_margen_superior;
	protected HorizontalLayout registrarse_mitad;
	protected TextField text_registrarse_correo;
	protected TextField text_registrarse_usuario;
	protected PasswordField text_registrarse_contraseña;
	protected PasswordField text_registrarse_contraseña2;
	protected TextField text_registrarse_nombre;
	protected TextArea text_registrarse_descripcion;
	protected Button boton_registro_atras;
	protected Button boton_registro_aceptar;
	protected HorizontalLayout registrarse_margen_inferior;

	public Registrarse_ventana() {
		Design.read(this);
	}
}
