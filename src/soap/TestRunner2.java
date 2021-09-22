package soap;

import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCaseRunner;
import com.eviware.soapui.model.testsuite.TestRunner.Status;
import com.eviware.soapui.support.SoapUIException;

public class TestRunner2 {

	@Test
	public void singletest() throws XmlException, IOException, SoapUIException
	{
        WsdlProject project=new WsdlProject("C://Users//vishnupriya//Documents//Automation-soapui-project.xml");
		
		WsdlTestSuite TestSuite=project.getTestSuiteByName("testing");
		
		WsdlTestCase TestCase=TestSuite.getTestCaseByName("getEmployee");
		TestCaseRunner runner=TestCase.run(new PropertiesMap(), false);	
		Assert.assertEquals(String.valueOf(Status.FINISHED),String.valueOf(runner.getStatus()));
	}
}
