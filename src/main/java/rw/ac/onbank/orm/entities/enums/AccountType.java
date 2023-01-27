package rw.ac.onbank.orm.entities.enums;


public enum AccountType {
    CHECKING,
    SAVINGS,
    CREDIT,
    INVESTMENT,
    LOAN,
    MORTGAGE;

    public double getInterestRate(){
        switch(this){
            case CHECKING:
                return 0.01;
            case SAVINGS:
                return 0.02;
            case CREDIT:
                return 0.05;
            case INVESTMENT:
                return 0.10;
            case LOAN:
                return 0.12;
            case MORTGAGE:
                return 0.15;
            default:
                throw new IllegalArgumentException();
        }
    }
    public int getWithdrawalLimit(){
        switch(this){
            case CHECKING:
                return 1000;
            case SAVINGS:
                return 500;
            case CREDIT:
            case LOAN:
            case MORTGAGE:
                return -1;
            case INVESTMENT:
                return 2000;
            default:
                throw new IllegalArgumentException();
        }
    }
}
