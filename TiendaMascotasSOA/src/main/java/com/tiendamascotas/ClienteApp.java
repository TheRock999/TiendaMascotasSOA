package com.tiendamascotas;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.CxfEndpoint;

public class ClienteApp extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // Configuración del endpoint CXF
        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setAddress("http://localhost:8080/tiendaMascotas"); // Reemplaza con la dirección correcta
        cxfEndpoint.setServiceClass(MiServicio.class); // Reemplaza con tu clase de servicio
        cxfEndpoint.setCamelContext(getContext());
        
        // Configuración de la ruta Camel
        from(cxfEndpoint)
            .to("direct:processService"); // Reemplaza con tu ruta de procesamiento
    }
}
