package sec2;
import java.util.Scanner;
import java.util.Date;
public class Board {
	Scanner sc = new Scanner(System.in);
	private int wrnum;
	private int wrtitle;
	private String wrcontent;
	private String wrhost;
	private Date wrdate;
	public Board(int wrnum, int wrtitle, String wrcontent, String wrhost, Date wrdate) {
		this.wrnum = wrnum;
		this.wrtitle = wrtitle;
		this.wrcontent = wrcontent;
		this.wrhost = wrhost;
		this.wrdate = wrdate;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public int getWrnum() {
		return wrnum;
	}

	public void setWrnum(int wrnum) {
		this.wrnum = wrnum;
	}

	public int getWrtitle() {
		return wrtitle;
	}

	public void setWrtitle(int wrtitle) {
		this.wrtitle = wrtitle;
	}

	public String getWrcontent() {
		return wrcontent;
	}

	public void setWrcontent(String wrcontent) {
		this.wrcontent = wrcontent;
	}

	public String getWrhost() {
		return wrhost;
	}

	public void setWrhost(String wrhost) {
		this.wrhost = wrhost;
	}

	public Date getWrdate() {
		return wrdate;
	}

	public void setWrdate(Date wrdate) {
		this.wrdate = wrdate;
	}

	public String boardkWirte(){
		int wrnum = sc.nextInt();
		int wrtitle = sc.nextInt();
		int wrcontent = sc.nextInt();
		int wrhost = sc.nextInt();	
		int wrdate = sc.nextInt();
	}
	
}
