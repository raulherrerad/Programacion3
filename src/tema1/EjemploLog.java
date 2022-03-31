package tema1;

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;
public class EjemploLog {


    private static final Logger loggerConsola = (Logger) LoggerFactory.getLogger("programacion.logConsola");
    private static final Logger loggerFichero = (Logger) LoggerFactory.getLogger("programacion.logFichero");
	 
    
    
       public static void main(String[] args)       
       { 
    	     // Set up a simple configuration that logs on the console.
 
           loggerConsola.info("Entrando.");
           loggerFichero.info("Estamos creando a Juan");
           Alumno juan = new Alumno();
           juan.nota =4;
           if (juan.nota<5) {
               loggerFichero.error("No has aprobado.");
               loggerConsola.error("No has aprobado.");
               
           }
           loggerFichero.trace("Exiting application.");
           loggerConsola.error("OHHHNIIIIOOOOO");
           loggerFichero.debug("ESTAMOS depurando");

		}

		
	}


