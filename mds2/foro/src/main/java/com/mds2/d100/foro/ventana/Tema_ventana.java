package com.mds2.d100.foro.ventana;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
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
public class Tema_ventana extends HorizontalLayout {
	protected Label label_tema_icono;
	protected Label label_tema_nombre;
	protected Label label_tema_descripcion;
	protected Label label_tema_likes;
	protected Button boton_tema_modificar;
	protected Button boton_tema_eliminar;
	protected Label label_tema_ultimo_usuario;
	protected Label label_tema_tiempo;

	public Tema_ventana() {
		Design.read(this);
	}
}
