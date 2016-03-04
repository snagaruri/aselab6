import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KmsToMiles {
	
CtoFService x = new CtoFService();
	
	long y  = x.mlTokm(1);
	
	long test = (long) 1.721371;
	
	
	@Test	
	public void testConversion() {
		
		assertEquals(y,test);
	}


}
