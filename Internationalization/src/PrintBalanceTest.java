import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.util.Date;

import org.junit.Test;



/**
 * Tests the PrintBalance class
 *
 * @author schepedw.
 *         Created Mar 30, 2012.
 */
public class PrintBalanceTest {
	private PrintBalance french=new PrintBalance("fr", "FR");
	private PrintBalance english=new PrintBalance("en", "US");
	private PrintBalance german=new PrintBalance("de", "DE");
	
	@Test
	public void testEnglishGreetings(){
		assertEquals("Hello ",this.english.getGreetings());
	}

	@Test
	public void testEnglishName(){
		assertEquals("What is your name? ",this.english.getName());
	}
	
	@Test
	public void testEnglishIntro(){
		assertEquals("I am pleased to meet you Dan", this.english.printro("Dan"));
	}
	
	@Test
	public void testEnglishToday(){
		assertEquals("As of: "+DateFormat.getDateTimeInstance(0, 0, this.english.currentLocale).format(new Date()), this.english.asOfToday());
	}
	
	@Test
	public void testEnglishYouOwe(){
		assertEquals("You owe $9,876,543.21",this.english.youOwe());
	}
	
	@Test
	public void testEnglishFarewell(){
		assertEquals("Goodbye ", this.english.goodbye());
	}@Test
	public void testgermanGreetings(){
		assertEquals("Hallo ",this.german.getGreetings());
	}

	@Test
	public void testgermanName(){
		assertEquals("Wie ist Ihr Name? ",this.german.getName());
	}
	
	@Test
	public void testgermanIntro(){
		assertEquals("Ich freue mich, Sie kennen zu lernen Dan", this.german.printro("Dan"));
	}
	
	@Test
	public void testgermanToday(){
		assertEquals("Ab: "+DateFormat.getDateTimeInstance(0, 0, this.german.currentLocale).format(new Date()), this.german.asOfToday());
	}
	
	@Test
	public void testgermanYouOwe(){
		assertEquals("Du schuldest 9.876.543,21 €",this.german.youOwe());
	}
	
	@Test
	public void testgermanFarewell(){
		assertEquals("Auf Wiedersehen ", this.german.goodbye());
	}@Test
	public void testFrenchGreetings(){
		assertEquals("Bonjour ",this.french.getGreetings());
	}

	@Test
	public void testFrenchName(){
		assertEquals("Quel est votre nom? ",this.french.getName());
	}
	
	@Test
	public void testFrenchIntro(){
		System.out.println("For testing purposes, enter the name Dan");
		assertEquals("Je suis heureux de vous rencontrer Dan", this.french.printro("Dan"));
	}
	
	@Test
	public void testFrenchToday(){
		assertEquals("En date du: "+ DateFormat.getDateTimeInstance(0, 0, this.french.currentLocale).format(new Date()), this.french.asOfToday());
	}
	
	@Test
	public void testFrenchYouOwe(){
		assertEquals("Vous devez 9 876 543,21 €",this.french.youOwe());
	}
	
	@Test
	public void testFrenchFarewell(){
		assertEquals("au revoir ", this.french.goodbye());
	}
}
