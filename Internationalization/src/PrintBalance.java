import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;


/**
 * TODO A simple class that needs to be localized
 * 
 * @author mohan. Created Mar 27, 2011.
 */
public class PrintBalance {
	private ResourceBundle messages;
	Locale currentLocale;

	/**
	 * Simple Java Method that is crying out to be localized.
	 * 
	 * @param args
	 */
	public PrintBalance(String language, String country) {
		this.currentLocale = new Locale(language, country);
		this.messages = ResourceBundle.getBundle("MessagesBundle",
				this.currentLocale);
	}

	/**
	 * 
	 * Returns greetings in the respective language.
	 * 
	 * @return a string
	 */
	public String getGreetings() {
		String msg1 = this.messages.getString("greetings");
		// Greeting
		return msg1;
	}

	public String getName() {
		return this.messages.getString("name?");
	}

	public String printro(String name) {
		return this.messages.getString("intro") + name;
	}
	
	// print today's date, balance and bid goodbye
	public String asOfToday() {
		return this.messages.getString("today")
				+ DateFormat.getDateTimeInstance(0, 0, this.currentLocale).format(new Date());
	}
	
	

	public String youOwe() {
		return this.messages.getString("owe")
				+NumberFormat.getCurrencyInstance(this.currentLocale).format(9876543.21);
	}


	public String goodbye() {
		return this.messages.getString("farewell");
	}
	
}
