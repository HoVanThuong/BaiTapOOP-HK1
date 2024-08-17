package chuong2.bai8;

public class MainTest8 {
    //{"Ted Murphy", 72354, 100000}; {"Jane Smith", 69713, 40000}; {"Edward Demsey", 93757,
    //700000}
    public static void main(String[] args) {
        Account acc1 = new Account(72354, "Ted Murphy", 100000);
        Account acc2 = new Account(69713, "Jane Smith",  40000);
        Account acc3 = new Account(93757, "Edward Demsey", 700000);
        if(acc1.deposit(250000))
            System.out.println("Gui thanh cong !!!");
        else {
            System.out.println("Gui that bai !!!");
        }
        if (acc2.deposit(500000))
            System.out.println("Gui thanh cong !!!");
        else {
            System.out.println("Gui that bai !!!");
        }
        if (acc2.withdraw(430000,2000))
            System.out.println("Rut thanh cong !!!");
        else {
            System.out.println("Rut that bai !!!");
        }
        // Tinh lai cho acc3
        acc3.addInterest();
        /// Xuat thong tin ///
        System.out.println(String.format("%-30s %15s %20s","Ten Tai Khoan","So TK","So Du"));
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());
        // Chuyen tu acc2 cho acc1 100000
        acc2.transfer(acc1, 100000);
        System.out.println();
        System.out.println(String.format("%-30s %15s %20s","Ten Tai Khoan","So TK","So Du"));
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

    }
}
