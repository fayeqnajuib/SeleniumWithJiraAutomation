package Listenersjira;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Jira.JiraServiceProvider;
import Jira.Jiraapi;

public class JiraTestListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
	
		Jiraapi jira=result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Jiraapi.class);
		
	boolean ticket=	jira.Ticketlogging();
	if(ticket) {
		
		System.out.println("Ticket ready for jira" +ticket);
		JiraServiceProvider jirasp=new JiraServiceProvider("https://fayeq.atlassian.net",
				"nfayeq@yahoo.com", 
				"a6ap8yU2W16rOo01B11z2175", "SEL");
	String issuesummary=result.getMethod().getConstructorOrMethod().getMethod().getName() + "Test got failed due to assertion failure";
	String issuedescription=result.getThrowable().getMessage()+"\n";
	
	issuedescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));
	
	jirasp.createJiraTicket("Bug", issuesummary, issuedescription, "Fayeq Najuib");
	}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
