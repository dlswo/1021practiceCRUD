package org.aram.domain;

import lombok.Data;

@Data
public class Param {

	private int bno, page, display, total, start, end;
	private boolean prev, next;

	public Param() {
		this.page = 1;
		this.display = 10;
	}

	public void setTotal(int total) {
		this.total = total;

		this.end = (int) (Math.ceil(this.page / 10.0) * 10);
		this.start = this.end - 9;

		if (this.end * this.display >= this.total) {
			this.end = (int) (Math.ceil(this.total / this.display));
			this.next = false;
		}else {
			this.next = true;
		}
		
		this.prev = this.start != 1;

	}
	
	public int getSkip() {
		return (this.page-1) *10;
	}

}
