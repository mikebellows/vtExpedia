package Log4j;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogginforExpedia {
	public static String vClassName= Thread.currentThread().getStackTrace()[1].getClassName();
	public static String vtClassName = vClassName.concat(".class");
	public static Logger vtlog = Logger.getLogger(vtClassName);
	
	public LogginforExpedia(){		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("Log4jproperties.properties");
//		/vtlog.info("This is a info statement");
		//vtlog.debug("This is the debug");
	}

}
