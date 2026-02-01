public class Equipment extends InventoryItem {

    private String assetId;
    private String brand;
    private int warrantyMonths;

    public Equipment(String id, String name, boolean isAvailable,
                     String assetId, String brand, int warrantyMonths) {

        super(id, name, isAvailable);
        this.assetId = assetId;
        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getItemType() {
        return "Equipment";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Asset ID: " + assetId +
                ", Brand: " + brand +
                ", Warranty (months): " + warrantyMonths;
    }
}
