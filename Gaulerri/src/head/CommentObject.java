package head;

import java.util.Date;

public class CommentObject {
	

	public Date date = new Date();
	public String commentsName;
	public String commentsText;
	
	public CommentObject(String commentsName, String commentsText) {
		this.commentsName = commentsName;
		this.commentsText = commentsText;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCommentsName() {
		return commentsName;
	}
	public void setCommentsName(String commentsName) {
		this.commentsName = commentsName;
	}
	public String getCommentsText() {
		return commentsText;
	}
	public void setCommentsText(String commentsText) {
		this.commentsText = commentsText;
	}
	
	
	
}
