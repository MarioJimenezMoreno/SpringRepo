package ejercicios;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class Ej01_Loggers {
	
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Ej01_Loggers.class);

	public static void main() {
		
		LOGGER.info("info");
		LOGGER.warn("warn");
		LOGGER.error("error");
		LOGGER.debug("debug");
		LOGGER.trace("trace");
		

	}

}
