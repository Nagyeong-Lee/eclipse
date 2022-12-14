package dto;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DTO {

	private int text_num;
	private String writer;
	private String text;
	private Timestamp write_time;

	public DTO() {}
	public DTO(int text_num, String writer, String text, Timestamp write_time) {
		super();
		this.text_num = text_num;
		this.writer = writer;
		this.text = text;
		this.write_time = write_time;
	}

	public int getText_num() {
		return text_num;
	}
	public void setText_num(int text_num) {
		this.text_num = text_num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Timestamp getWrite_time() {
		return write_time;
	}
	public void setWrite_time(Timestamp write_time) {
		this.write_time = write_time;
	}
	
	public String getFormedDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM월dd일 hh시mm분");
		return sdf.format(write_time);
	}

}
