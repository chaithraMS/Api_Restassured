package pojoUtility;

public class AddProjectPojoClass {

	String createdBy;
	String projectName;
	String status;
	int teamSize;
	
	public AddProjectPojoClass(String createdBy, String projectName, String status, int teamSize) {
		super();
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedby(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectname(String projectname) {
		this.projectName = projectname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTeamsize() {
		return teamSize;
	}
	public void setTeamsize(int teamsize) {
		this.teamSize = teamsize;
	}
	
	
	
	
	
	
}
