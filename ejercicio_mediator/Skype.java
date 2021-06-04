package mediator.ejercicios;


import java.util.HashMap;

public class Skype implements ICanalDeComunicacion {
    private HashMap<String, Persona> personasChat= new HashMap<>();

    public void addPersonasAlChat(Persona persona){
        personasChat.put(persona.getCi(),persona);
    }

    @Override
    public void send(String message, Colleague personaOrigen) {
        Persona personaParseOrigen= (Persona) personaOrigen;

        for (HashMap.Entry<String, Persona> persona : personasChat.entrySet()) {
            if ( !personaParseOrigen.getCi().equals(persona.getValue().getCi())){
                if (personaParseOrigen.getCargo().equals("SM")){
                    persona.getValue().messageReceived(message);
                }
                if (personaParseOrigen.getCargo().equals("QA") && persona.getValue().getCargo().equals("QA")){
                    persona.getValue().messageReceived(message);
                }
                if (personaParseOrigen.getCargo().equals("DEV") && persona.getValue().getCargo().equals("DEV")){
                    persona.getValue().messageReceived(message);
                }
            }
        }


    }

}
