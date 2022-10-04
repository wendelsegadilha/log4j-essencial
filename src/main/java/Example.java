import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class Example {

	/* Get the class name to be printed on */
	static Logger log = Logger.getLogger(Example.class.getName());

	public static void main(String[] args) throws IOException, SQLException {

		log.trace("Trace Message!");
		log.debug("Debug Message!");
		log.info("Info Message!");
		log.warn("Warn Message!");
		log.error("Error Message!");
		log.fatal("Fatal Message!");

	}

}