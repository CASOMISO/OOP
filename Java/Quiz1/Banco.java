package banco;
public class Banco 
{
        private final checkingAccount cuentaUno;
        private final checkingAccount cuentaDos;
        
        public Banco()
        {
            cuentaUno = new checkingAccount("Antonio", 0, "AB1");
            cuentaDos = new checkingAccount("Maria" , 50000 , "AB2");
        }
        public static void main (String[] args)
        {
            Banco BancoNacional = new Banco();
            System.out.println("\n---------------------------- Cuenta 1 ----------------------------");
            System.out.println("\nSu balance actual es de: $" + BancoNacional.cuentaUno.getBalance());
            System.out.println("\nSu consignacion por $" + BancoNacional.cuentaUno.setconsignacion(20000) + " fue exitosa");
            System.out.println("\nSu balance actual es de: $"+BancoNacional.cuentaUno.getBalance());
            System.out.println("\nSu consignacion por $"+BancoNacional.cuentaUno.setconsignacion(50000)+ " fue exitosa");
            System.out.println("\nSu balance actual es de: $"+BancoNacional.cuentaUno.getBalance());
            System.out.println("\nSu consignacion por $"+BancoNacional.cuentaUno.setconsignacion(70000)+ " fue exitosa");
            System.out.println("\nSu balance actual es de: $"+BancoNacional.cuentaUno.getBalance());
            System.out.println("\nSu retiro por $"+BancoNacional.cuentaUno.setretiro(10000)+" fue exitoso");
            System.out.println("\nSu balance actual es de: $"+BancoNacional.cuentaUno.getBalance());
            System.out.println("\nSu retiro por $"+BancoNacional.cuentaUno.setretiro(5000)+" fue exitoso");
            System.out.println("\nSu balance actual es de: $"+BancoNacional.cuentaUno.getBalance());
            System.out.println("\nSu retiro por $"+BancoNacional.cuentaUno.setretiro(20000)+" fue exitoso");
            System.out.println("\nSu balance actual es de: $"+BancoNacional.cuentaUno.getBalance());
            //System.out.println("\nSu cuota de interes mensual es de: $"+BancoNacional.cuentaUno.obtenerInteresMensual());
            //System.out.println("\nEl dinero ganado por medio del CDT es de: $" + BancoNacional.cuentaUno.CDT(6, 10000));
            System.out.println("\n---------------------------- Cuenta 2 ----------------------------");
            System.out.println("\nSu balance actual es de: $"+BancoNacional.cuentaDos.getBalance());
            System.out.println("\nSu consignacion por $"+BancoNacional.cuentaDos.setconsignacion(20000)+ " fue exitosa");
            System.out.println("\nSu balance actual es de: $"+BancoNacional.cuentaDos.getBalance());
            System.out.println("\nSu consignacion por $"+BancoNacional.cuentaDos.setconsignacion(50000)+ " fue exitosa");
            System.out.println("\nSu balance actual es de: $"+BancoNacional.cuentaDos.getBalance());
            System.out.println("\nSu consignacion por $"+BancoNacional.cuentaDos.setconsignacion(70000)+ " fue exitosa");
            System.out.println("\nSu balance actual es de: $"+BancoNacional.cuentaDos.getBalance());
            System.out.println("\nSu retiro por $"+BancoNacional.cuentaDos.setretiro(10000)+" fue exitoso");
            System.out.println("\nSu balance actual es de: $"+BancoNacional.cuentaDos.getBalance());
            System.out.println("\nSu retiro por $"+BancoNacional.cuentaDos.setretiro(5000)+" fue exitoso");
            System.out.println("\nSu balance actual es de: $"+BancoNacional.cuentaDos.getBalance());
            System.out.println("\nSu retiro por $"+BancoNacional.cuentaDos.setretiro(20000)+" fue exitoso");
            System.out.println("\nSu balance actual es de: $"+BancoNacional.cuentaDos.getBalance());
            //System.out.println("\nSu cuota de interes mensual es de: $"+BancoNacional.cuentaDos.obtenerInteresMensual());
            //System.out.println("\nEl dinero ganado por medio del CDT es de: $" + BancoNacional.cuentaDos.setCDT(3, 500000));
            //System.out.println("\nEl dinero ganado por medio del CDT es de: $" + BancoNacional.cuentaDos.setCDT(3, 500000));
            //System.out.println("\nEl dinero ganado por medio del CDT es de: $" + BancoNacional.cuentaDos.setCDT(3, 500000));
        }
}