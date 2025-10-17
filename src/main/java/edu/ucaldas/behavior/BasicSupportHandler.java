package edu.ucaldas.behavior;

public class BasicSupportHandler extends Handler {
    @Override
    public String handleRequest(String request) {
        if (request.equalsIgnoreCase("básica") || request.equalsIgnoreCase("basica")) {
            return "Atendido por Soporte Básico";
        } else if (next != null) {
            return next.handleRequest(request);
        } else {
            return "No se puede atender la solicitud.";
        }
    }
}
