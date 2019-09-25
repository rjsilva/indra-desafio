package br.com.indra.dto;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class MensagemDTO {
	
	
	private String title;
	
	private Integer userId;
	
	private Integer id;

	private Boolean completed;
	

	public String getTitle() {
		
		return title;
	}

	public void setTitle(String title) {
		
		this.title = title;
	}

	public Integer getUserId() {
		
		return userId;
	}

	public void setUserId(Integer userId) {
		
		this.userId = userId;
	}

	public Integer getId() {
		
		return id;
	}

	public void setId(Integer id) {
		
		this.id = id;
	}

	public Boolean getCompleted() {
		
		return completed;
	}

	public void setCompleted(Boolean completed) {
		
		this.completed = completed;
	}

}
