package level3;

public class Generic {

    public <T extends Phone> void usePhone(T device) {
        System.out.println("\n---Método limitado por la Interface Teléfono---\n" +
                "\nAparato recibido --> " + device.getBrand() +
                "\nMétodos disponibles:\nInformación del aparato --> " + device.toString() +
                "\nHacer una llamada --> " + device.call() + "\n(pertenecen a la interface Teléfono)" +
                "\nMétodo no permitido: tomar una foto. \n(pertenece a la clase SmartPhone)");
    }

    public <T extends SmartPhone> void useSmartphone(T device) {
        System.out.println("\n---Método limitado por la Clase SmartPhone---\n" +
                "\nAparato recibido --> " + device.getBrand() +
                "\nMétodos disponibles:\nInformación del aparato --> " + device.toString() +
                "\nHacer una llamada --> " + device.call() + "\nTomar una Foto --> " + device.takePic() +
                "\n(pertenecen a la clase SmartPhone)");

    }
}
