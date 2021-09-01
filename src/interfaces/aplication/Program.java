package interfaces.aplication;

import interfaces.model.entities.CarRental;
import interfaces.model.entities.Vehicle;
import interfaces.model.services.BrazilTaxService;
import interfaces.model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        // Uma locadora brasileira de carros cobra um valor por hora para locações de até 12 horas.
        // Porém, se a duração da locação ultrapassar 12 horas, a locação será
        // cobrada com base em um valor diário. Além do valor da locação, é acrescido no
        // preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20%
        // Fazer um para valores até 100.00, ou 15% para valores acima de 100.00.
        // programa que lê os dados da locação (modelo do carro, instante inicial e final da
        // locação), bem como o valor por hora e o valor diário de locação. O programa
        // deve então gerar a nota de pagamento (contendo valor da locação, valor do
        // imposto e valor total do pagamento) e informar os dados na tela.


        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
        Date start = sdf.parse(sc.nextLine());
        System.out.print("Return (dd/MM/yyyy hh:ss): ");
        Date finish = sdf.parse(sc.nextLine());

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("Invoice:");
        System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();
    }
}
