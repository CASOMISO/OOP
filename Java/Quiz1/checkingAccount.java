package banco;
public class checkingAccount
    {
        private int balance;
        private final double tasaInteres;
        private final double tasaCDT;
        private double gananciaCDT;
        
        public checkingAccount(String ponerNombre, int ponerBalance, String ponerId)
        {
            this.balance = ponerBalance;
            this.tasaInteres = 0.02;
            this.tasaCDT = 0.10;
        }
        public int getBalance()
        {
            return this.balance;
        }
        public void setBalance(int nuevoBalance)
        {
            this.balance = nuevoBalance;
        }
        /*public double getInteresMensual()
        {
            return this.tasaInteres * this.balance;
        }*/
        public int setconsignacion(int valorConsignacion)
        {
            this.balance = this.balance + valorConsignacion;
            return valorConsignacion;
        }
        public int setretiro(int valorRetiro)
        {
            this.balance = this.balance - valorRetiro;
            return valorRetiro;
        }
        /*public double setCDT (double meses, double depositoCDT)
        {
            if (gananciaCDT==0)
            {
                gananciaCDT = depositoCDT * this.tasaCDT * meses;
            }
            else
            {
                gananciaCDT=gananciaCDT+(depositoCDT * this.tasaCDT * meses);
            }
            return gananciaCDT;
        }*/
    }