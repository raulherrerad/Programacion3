package tema3;

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;

public class EjemploLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logFich = (Logger) LoggerFactory.getLogger("tema3.logSalidaFichero");
		Logger logCon = (Logger) LoggerFactory.getLogger("Consola");
		Logger log = (Logger) LoggerFactory.getLogger(EjemploLog.class);
		
		
		
		//Mostramos logs de menor nivel de importancia a mayor
		logFich.trace("FICHERO: esto es una traza");
		logFich.debug("FICHERO:Mensaje de depuracion");
		logFich.info("FICHERO:Mensaje de informacion: ej. usuario logado");
		logFich.warn("FICHERO:Mensaje de advertencia, ej recursos cerca de limite");
		logFich.error("FICHERO:Mensaje de error, ha pasado algo grave");

		
		//Mostramos logs de menor nivel de importancia a mayor
		logCon.trace("CONSOLA:esto es una traza");
		logCon.debug("CONSOLA:Mensaje de depuracion");
		logCon.info("CONSOLA:Mensaje de informacion: ej. usuario logado");
		logCon.warn("CONSOLA:Mensaje de advertencia, ej recursos cerca de limite");
		logCon.error("CONSOLA:Mensaje de error, ha pasado algo grave");

		//Mostramos logs de menor nivel de importancia a mayor
		log.trace("esto es una traza");
		log.debug("Mensaje de depuracion");
		log.info("Mensaje de informacion: ej. usuario logado");
		log.warn("Mensaje de advertencia, ej recursos cerca de limite");
		log.error("Mensaje de error, ha pasado algo grave");

		
		
	}

}
