
class TicketFacade {
    private EventSelection eventSelection;
    private SeatSelection seatSelection;
    private Payment payment;

    public TicketFacade() {
        this.eventSelection = new EventSelection();
        this.seatSelection = new SeatSelection();
        this.payment = new Payment();
    }

    public void orderTicket(String event, String seat, double amount) {
        eventSelection.selectEvent(event);
        seatSelection.selectSeat(seat);
        payment.pay(amount);
    }
}
