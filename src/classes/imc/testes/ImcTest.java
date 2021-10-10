package classes.imc.testes;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import classes.imc.ImcValid;

public class ImcTest {
ImcValid imv;
@Before
public void init()
{
imv=new ImcValid();	
}
@Test
public void testPoid()
{
assertTrue(imv.validePoid(60));	
}


}
