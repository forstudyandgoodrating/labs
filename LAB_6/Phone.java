public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }

    public Phone() {
        this.number = "Немає номеру";
        this.model = "Невідома модель";
        this.weight = 0.0;
    }

    public void receiveCall(String name) {
        System.out.println("Дзвонить " + name);
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("Дзвонить " + name + " з номеру " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Відправка повідомлення на номери:");
        for (String num : numbers) {
            System.out.println("- " + num);
        }
    }
}