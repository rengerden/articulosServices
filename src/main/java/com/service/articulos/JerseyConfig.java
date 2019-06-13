package com.service.articulos;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.service.articulos.controllers.ArticulosController;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        registerEndpoints();
    }
    private void registerEndpoints() {
       register(ArticulosController.class);
    }
}