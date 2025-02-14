class ATMWithdrawal {
    private static final int CORRECT_PIN = 1234;
    private static double balance = 3000;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();
            
            if (enteredPin != CORRECT_PIN) {
                throw new Exception("Error: Invalid PIN.");
            }
            
            System.out.print("Withdraw Amount: ");
            double withdrawAmount = sc.nextDouble();
            
            if (withdrawAmount > balance) {
                throw new Exception("Error: Insufficient balance.");
            }
            
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful. Remaining Balance: " + balance);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Current Balance: " + balance);
        }
        
        sc.close();
    }
}
