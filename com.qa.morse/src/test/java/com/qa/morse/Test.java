package com.qa.morse;


	import static org.junit.Assert.assertEquals;

import com.qa.hashmaps.Morse;
	public class Test {
		Morse mt = new Morse();
		@org.junit.Test
		public void morseTranslatorTest() {
			assertEquals("YOU CAN NOW LEAVE", mt.morseTranslator("-.-- --- ..- ....... -.-. .- -. ....... -. --- .-- ....... .-.. . .- ...- ."));
		}
	}


