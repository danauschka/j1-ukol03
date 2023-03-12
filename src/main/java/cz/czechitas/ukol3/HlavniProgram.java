package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Computer;
import cz.czechitas.ukol3.model.Drive;
import cz.czechitas.ukol3.model.Memory;
import cz.czechitas.ukol3.model.Processor;


/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Computer thisComputer = new Computer();

        Processor thisProcessor = new Processor();
        thisProcessor.setManufacturer("AMD");
        thisProcessor.setSpeed(3500000000L);

        Drive thisDrive = new Drive();
        thisDrive.setCapacity(1099511627776L);
        thisDrive.setUsedSpace(549755813888L);

        Memory thisMemory = new Memory();
        thisMemory.setMemory(68719476736L);

        thisComputer.setCpu(thisProcessor);
        thisComputer.setRam(thisMemory);
        thisComputer.setHardDrive(thisDrive);


        System.out.println("Manufacturer: " + thisProcessor.getManufacturer());
        System.out.println("Speed: " + thisProcessor.getSpeed());
        System.out.println("Memory: " + thisMemory.getMemory());
        System.out.println("Capacity: " + thisDrive.getCapacity());
        System.out.println("Used Space: " + thisDrive.getUsedSpace());

        thisComputer.turnOn();
        thisComputer.turnOff();


    }



}
