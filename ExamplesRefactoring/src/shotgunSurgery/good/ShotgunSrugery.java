/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shotgunSurgery.good;



/**
 *
 * @author CltControl
 */
public class ShotgunSrugery {

    public static void main(String[] args) throws Exception {
        AccountRefactored acc = new AccountRefactored("Personal", "AC1234", 1000);
        acc.debit(500);
        acc.sendWarningMessage();
        //acc.debit(500);
    }
}
