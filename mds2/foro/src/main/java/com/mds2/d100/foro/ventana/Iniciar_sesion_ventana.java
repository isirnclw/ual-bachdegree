package com.mds2.d100.foro.ventana;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PasswordField;
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
public class Iniciar_sesion_ventana extends VerticalLayout {
	protected HorizontalLayout iniciar_sesion_superior;
	protected VerticalLayout iniciar_sesion_mitad;
	protected TextField text_iniciar_sesion_usuario;
	protected PasswordField text_iniciar_sesion_contraseña;
	protected Button boton_recordar_contrasena;
	protected Button boton_iniciar_sesion_entrar;
	protected HorizontalLayout iniciar_sesion_inferior;

	public Iniciar_sesion_ventana() {
		Design.read(this);
	}
}
