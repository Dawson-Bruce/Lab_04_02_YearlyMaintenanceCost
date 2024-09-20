public class Main {
    public static void main(String[] args) {
        double springMaintenanceCost = 2042.11;
        System.out.println("Spring maintenance cost: $" + springMaintenanceCost);

        double summerMaintenanceCost = 2981.62;
        System.out.println("Summer maintenance cost: $" + summerMaintenanceCost);

        double fallMaintenanceCost = 2101.89;
        System.out.println("Fall maintenance cost: $" + fallMaintenanceCost);

        double yearlyMaintenanceCost = springMaintenanceCost + summerMaintenanceCost + fallMaintenanceCost + winterMaintenanceCost;
        System.out.println("Yearly maintenance cost: $" + yearlyMaintenanceCost);
    }
}