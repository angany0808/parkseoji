package springGit0206_ex.message.dto;

import java.time.LocalDateTime;

public class MessageDto {
	
	private int messageId;
	private String guestName;
	private String message;
	private LocalDateTime wdate;
	public MessageDto(int messageId, String guestName, String message, LocalDateTime wdate) {
		super();
		this.messageId = messageId;
		this.guestName = guestName;
		this.message = message;
		this.wdate = wdate;
	}
	public MessageDto() {
		super();
	}
	public final int getMessageId() {
		return messageId;
	}
	public final void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public final String getGuestName() {
		return guestName;
	}
	public final void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public final String getMessage() {
		return message;
	}
	public final void setMessage(String message) {
		this.message = message;
	}
	public final LocalDateTime getWdate() {
		return wdate;
	}
	public final void setWdate(LocalDateTime wdate) {
		this.wdate = wdate;
	}
	@Override
	public String toString() {
		return "MessageDto [messageId=" + messageId + ", guestName=" + guestName + ", message=" + message + ", wdate="
				+ wdate + "]";
	}
	
}
