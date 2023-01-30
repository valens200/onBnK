package rw.ac.onbank.orm.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rw.ac.onbank.orm.entities.superEntities.BankEntities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
public class Bill extends BankEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long billId;
    private long billAMount;
    private Date billDueDate;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Bill() {

    }

    public long getBillAMount() {
        return billAMount;
    }

    public void setBillAMount(long billAMount) {
        this.billAMount = billAMount;
    }

    public Date getBillDueDate() {
        return billDueDate;
    }

    public void setBillDueDate(Date billDueDate) {
        this.billDueDate = billDueDate;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}