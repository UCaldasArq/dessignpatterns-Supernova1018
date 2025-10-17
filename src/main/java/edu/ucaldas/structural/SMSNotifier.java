package edu.ucaldas.structural;

public class SMSNotifier extends NotifierDecorator {
    public SMSNotifier(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public String send(String message) {
        // Llama al decorado (email) y añade su propio comportamiento
        String result = super.send(message);
        return "SMS enviado: " + message;
    }

}
