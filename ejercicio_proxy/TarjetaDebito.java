package proxy.ejercicios;

public class TarjetaDebito implements IIntermediario{
    private CuentaBancaria cuenta;
    private int numeroTarjeta;

    public TarjetaDebito(CuentaBancaria cuenta, int numeroTarjeta){
        this.numeroTarjeta= numeroTarjeta;
                this.cuenta= cuenta;
    }
    @Override
    public void pagar(int monto,String moneda) {
       System.out.println("Utilizando la cuenta de: "+cuenta.getUser().getName());
       System.out.println("Nro cuenta: "+numeroTarjeta);
        switch (moneda)
        {
            case "Dolares":
                monto= monto*7;

            case "Euros":
                monto= monto*8;
            default:

        }
        if(cuenta.getSaldo()-monto>=0){
            cuenta.pagar(monto,moneda);

        }else{
            System.out.println("No hay saldo suficiente para realizar la transaccion");
        }

    }
}
