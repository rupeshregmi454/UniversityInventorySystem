public abstract class InventoryItem {

    protected String id;
    protected String name;
    protected boolean isAvailable;

    public InventoryItem(String id, String name, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.isAvailable = isAvailable;
    }

    public abstract String getItemType();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Available: " + isAvailable +
                ", Type: " + getItemType();
    }
}
