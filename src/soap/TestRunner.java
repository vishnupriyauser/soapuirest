package soap;
import java.io.IOException;
import org.apache.xmlbeans.XmlException;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCaseRunner;
import com.eviware.soapui.model.testsuite.TestRunner.Status;
import com.eviware.soapui.support.SoapUIException;
public class TestRunner {
         //	public static void main(String[] args) throws IOException, SoapUIException, XmlException {
		// TODO Auto-generated method stub
	
@Test
public void soap() throws XmlException, IOException, SoapUIException
{
		WsdlProject project=new WsdlProject("C://Users//vishnupriya//Documents//Automation-soapui-project.xml");
		
		WsdlTestSuite TestSuite=project.getTestSuiteByName("testing");
		
		for(int i=0;i<TestSuite.getTestCaseCount();i++)
		{		
			WsdlTestCase TestCase=TestSuite.getTestCaseAt(i);		
			TestCaseRunner runner=TestCase.run(new PropertiesMap(), false);		
			Assert.assertEquals(String.valueOf(Status.FINISHED),String.valueOf(runner.getStatus()));
		}
	}
}
