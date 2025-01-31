package yoking.exercise9;

public class Task {

	private int id;
	private String title;
	private String description;
	private String status;

	
	public int getId() {
		return this.id;
	}

	public void setId(int idValue) {
		this.id = idValue;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String theTitle) {
		this.title = theTitle;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String theDescription) {
		this.description = theDescription;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String theStatus) {
		this.status = theStatus;
	}

	public void Complete() {
		if(this.status.equals("finalizado")) {
			System.out.println("Ya esta finalizado ");
			return;
		}
		System.out.println("Finalizado");
		this.status = "finalizado";
	}

}
