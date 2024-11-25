public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0; // Số lượng đĩa video trong giỏ hàng

    // Phương thức thêm đĩa video vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is almost full!");
            }
        } else {
            System.out.println("The cart is full! Cannot add more items.");
        }
    }

    // Phương thức xóa đĩa video khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(disc.getTitle())) {
                itemsOrdered[i] = itemsOrdered[qtyOrdered - 1]; // Thay thế với đĩa cuối cùng
                itemsOrdered[qtyOrdered - 1] = null; // Xóa đĩa cuối cùng
                qtyOrdered--;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
                return;
            }
        }
        System.out.println("The disc \"" + disc.getTitle() + "\" was not found in the cart.");
    }

    // Phương thức tính tổng chi phí của giỏ hàng
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    // Phương thức in danh sách đĩa video trong giỏ hàng
    public void printCart() {
        System.out.println("Items in the cart:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println("- " + itemsOrdered[i].getTitle() + " (Cost: " + itemsOrdered[i].getCost() + ")");
        }
        System.out.println("Total Cost: " + totalCost());
    }
}