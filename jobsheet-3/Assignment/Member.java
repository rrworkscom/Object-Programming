public class Member {

    public String numberID;
    private String name;
    private int limitLoan;
    private int loanAmount;
    public int amount;

    public Member(String numberID, String name, int limitLoan) {
        this.numberID = numberID;
        this.name = name;
        this.limitLoan = limitLoan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 

    public int getLimitLoan() {
        return limitLoan;
    }

    public void setLimitLoan(int limitLoan) {
        this.limitLoan = limitLoan;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void borrow(int loanAmount) {
        if(loanAmount > this.limitLoan) {
            System.out.println("Sorry, the loan amount exceeds the limit.");
        } else {    
            this.loanAmount = loanAmount;
        }
    }

    public void installments(int amount) {
        if(amount < loanAmount * 0.10) {
            System.out.println("Sorry, the installment must  e 10% of the loan amount");
        } else {
            loanAmount -= amount;
        }
    }

}
