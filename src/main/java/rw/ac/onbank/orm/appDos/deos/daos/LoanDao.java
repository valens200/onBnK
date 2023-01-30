package rw.ac.onbank.orm.appDos.deos.daos;

import rw.ac.onbank.orm.entities.Loan;

import java.util.List;

public interface LoanDao {
    public List<Loan> getAllLoans();
    public Loan getLoanById(long id);
    public  boolean saveLoan(Loan loan);
    public boolean deleteLoanById(long id);


}