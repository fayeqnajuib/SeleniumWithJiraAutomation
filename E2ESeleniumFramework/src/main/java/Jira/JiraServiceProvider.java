package Jira;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.Issue.FluentCreate;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;

public class JiraServiceProvider {

	public JiraClient j;
public String project;

public JiraServiceProvider(String JiraUrl,String Username,String Password,String project) {
	BasicCredentials creds=new BasicCredentials(Username,Password);
	j=new JiraClient(JiraUrl,creds);
this.project=project;
}
public void createJiraTicket(String issuetype,String summary,String description,String reporter) {
	try {
		FluentCreate fc=j.createIssue(project, issuetype);
	fc.field(Field.SUMMARY, summary);
	fc.field(Field.DESCRIPTION, description);
	Issue issue=fc.execute();
	System.out.println("New issue id " +issue);
	
	
	} catch (JiraException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


}
}
