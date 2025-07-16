class Account
{
    void deposit(double amount)
    {
        System.out.println("Depositing: " + amount);
    }
    public static void main (String[] args)
    {
        Account account = new Account();// creating an instance of Account
        account.deposit(10000.0);
        System.out.println("Deposit succesfully");
    }
}
