package entities;

import java.time.LocalDate;

public class Loan {

	private Book bookReference;
	private Member member;
	private LocalDate pickupDate;
	private LocalDate scheduledReturn;
	
	public Loan () {
	
}

	public Loan(Book bookReference, Member member) {
	
		this.bookReference = bookReference;
		this.member = member;
		this.pickupDate = LocalDate.now();
		this.scheduledReturn = this.pickupDate.plusDays(7);
	}

	

	public Book getBookReference() {
		return bookReference;
	}

	public void setBookReference(Book bookReference) {
		this.bookReference = bookReference;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public LocalDate getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(LocalDate pickupDate) {
		this.pickupDate = pickupDate;
	}

	public LocalDate getScheduledReturn() {
		return scheduledReturn;
	}

	public void setScheduledReturn(LocalDate scheduledReturn) {
		this.scheduledReturn = scheduledReturn;
	}

	
	
}
	
	

