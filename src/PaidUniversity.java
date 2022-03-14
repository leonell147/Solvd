public class PaidUniversity extends University{
    private int payment;

    public PaidUniversity(String name) {
        super(name);
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }
}
