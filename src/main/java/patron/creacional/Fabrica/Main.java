package patron.creacional.Fabrica;

import patron.creacional.Fabrica.implementacion.EmailNotificationCreator;
import patron.creacional.Fabrica.implementacion.PushNotificationCreator;
import patron.creacional.Fabrica.implementacion.SMSNotificationCreator;
import patron.creacional.Fabrica.interfaces.Notificacion;
import patron.creacional.Fabrica.interfaces.NotificacionCreator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

//    Caso Práctico: Sistema de Notificaciones
//    Estás desarrollando un sistema de notificaciones para una aplicación.
//    La aplicación necesita enviar diferentes tipos de notificaciones a los usuarios,
//    como notificaciones por correo electrónico, SMS y push notifications (notificaciones push).

    public static void main(String[] args) {

        List<NotificacionCreator> creadoresNotificaciones = Arrays.asList(
                new EmailNotificationCreator(),
                new PushNotificationCreator(),
                new SMSNotificationCreator()
        ) ;

        List<String> mensajes = Arrays.asList(
                "Hola soy Pablo","Saludos lucia","Caos en argentina"
        ) ;
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt((3 - 1) + 1) + 1;
            NotificacionCreator creador  =  creadoresNotificaciones.get(randomNumber-1);
            Notificacion notificacion = creador.createNotification();
            notificacion.setMessage(mensajes.get(randomNumber-1));
            notificacion.send();
          String mensaje =  notificacion.verMensaje();
            System.out.println("Mensaje numero "+(i+1)+" Mjs: "+mensaje);



        }


    }
}
