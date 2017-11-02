/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhertance;

/**
 *
 * @author EsraaHus93
 */
public class Account {
    
    private int Deposit;
    private String name;
    private int Amount;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the Amount
     */
    public int getAmount() {
        return Amount;
    }

    /**
     * @param Amount the Amount to set
     */
    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    /**
     * @param Deposit the Deposit to set
     */
    public void setDeposit(int Deposit) {
        this.Deposit = Deposit;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
          
}
