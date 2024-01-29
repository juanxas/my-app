package com.example.application.views.añadir;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Añadir")
@Route(value = "my-view", layout = MainLayout.class)
@Uses(Icon.class)
public class AñadirView extends Composite<VerticalLayout> {

    public AñadirView() {
        FormLayout formLayout3Col = new FormLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        Button buttonSecondary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        formLayout3Col.setWidth("100%");
        formLayout3Col.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        textField.setLabel("Producto");
        textField.setWidth("min-content");
        textField2.setLabel("Tipo");
        textField2.setWidth("min-content");
        textField3.setLabel("Cantidad");
        textField3.setWidth("min-content");
        buttonSecondary.setText("Añadir");
        buttonSecondary.setWidth("min-content");
        getContent().add(formLayout3Col);
        formLayout3Col.add(textField);
        formLayout3Col.add(textField2);
        formLayout3Col.add(textField3);
        formLayout3Col.add(buttonSecondary);
    }
}
