public class FoodPackets {
    public static void main(String[] args) {
        int totalPackets = 1193; // Total packets received
        int dozenSize = 12; // One dozen = 12 units

        int dozens = totalPackets / dozenSize; // Calculate the number of dozens
        int extraPackets = totalPackets % dozenSize; // Calculate the remaining packets

        System.out.println("Total dozens of packets: " + dozens);
        System.out.println("Extra packets remaining: " + extraPackets);
    }
}
