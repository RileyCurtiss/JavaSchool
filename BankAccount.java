public class BankAccount {
    String newName;
    double amt1;
    double amt2;

    public BankAccount() { } //Default Constructor

    public BankAccount(String newName, double amt1, double amt2) {
        this.newName = newName;
        this.amt1 = amt1;
        this.amt2 = amt2;
    }

    public void setName(String nN) {
        newName = nN;
    }
    public String getName() {
        return newName;
    }
    public void setChecking(double amt) {
        amt1 = amt;
    }
    public double getChecking() {
        return amt1;
    }
    public void setSavings(double amt) {
        amt2 = amt;
    }
    public double getSavings() {
        return amt2;
    }

    public void depositChecking(double amt) {
        if (amt >= 0) {
            amt1 += amt;
        }
    }
    public void depositSavings(double amt) {
        if (amt >= 0) {
            amt2 += amt;
        }
    }
    public void withdrawChecking(double amt) {
        if (amt1 >= 0 && amt <= amt1 && amt >= 0) {
            amt1 -= amt;
        }
    }
    public void withdrawSavings(double amt) {
        if (amt2 >= 0 && amt <= amt1 && amt >= 0) {
            amt2 -= amt;
        }
    }

    public void transferToSavings(double amt) {
        amt1 -= amt;
        amt2 += amt;
    }

}