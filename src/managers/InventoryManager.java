public class InventoryManager {

    public void assignEquipment(StaffMember staff, Equipment equipment)
            throws InventoryException {

        if (staff == null) {
            throw new StaffMemberNotFoundException("Staff member not found.");
        }

        if (equipment == null) {
            throw new InventoryException("Invalid equipment.");
        }

        if (!equipment.isAvailable()) {
            throw new EquipmentNotAvailableException(
                    "Equipment is currently not available."
            );
        }

        if (staff.getAssignedEquipmentCount() >= 5) {
            throw new AssignmentLimitExceededException(
                    "Staff member has reached the maximum assignment limit."
            );
        }

        staff.addAssignedEquipment(equipment);
        equipment.setAvailable(false);
    }

    public void returnEquipment(StaffMember staff, String assetId)
            throws InventoryException {

        if (staff == null) {
            throw new StaffMemberNotFoundException("Staff member not found.");
        }

        boolean removed = staff.removeAssignedEquipment(assetId);

        if (!removed) {
            throw new InventoryException(
                    "Equipment not found in staff assignments."
            );
        }
    }

    public double calculateMaintenanceFee(Equipment equipment, int daysOverdue) {

        if (equipment == null || daysOverdue <= 0) {
            return 0;
        }

        double feePerDay;

        switch (equipment.getItemType()) {
            case "Equipment":
                feePerDay = 10.0;
                break;
            default:
                feePerDay = 5.0;
                break;
        }

        return feePerDay * daysOverdue;
    }

    public void searchEquipment(String name) {
        System.out.println("Searching equipment by name: " + name);
    }

    // Search equipment by category and availability
    public void searchEquipment(String category, boolean availableOnly) {
        System.out.println(
                "Searching equipment in category: " + category +
                " | Available only: " + availableOnly
        );
    }

    public void searchEquipment(int minWarranty, int maxWarranty) {
        System.out.println(
                "Searching equipment with warranty between " +
                minWarranty + " and " + maxWarranty + " months"
        );
    }

    public boolean validateAssignment(StaffMember staff, Equipment equipment) {

        if (staff != null) {
            if (equipment != null) {
                if (equipment.isAvailable()) {
                    if (staff.getAssignedEquipmentCount() < 5) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
