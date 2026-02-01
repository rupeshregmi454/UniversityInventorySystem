public class InventoryException extends Exception {

    public InventoryException(String message) {
        super(message);
    }
}

class EquipmentNotAvailableException extends InventoryException {

    public EquipmentNotAvailableException(String message) {
        super(message);
    }
}

class StaffMemberNotFoundException extends InventoryException {

    public StaffMemberNotFoundException(String message) {
        super(message);
    }
}

class AssignmentLimitExceededException extends InventoryException {

    public AssignmentLimitExceededException(String message) {
        super(message);
    }
}
