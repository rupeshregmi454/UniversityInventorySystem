# UniversityInventorySystem
# University Inventory Management System (Console App)

Modern universities manage thousands of assets across departments (computers, lab tools, furniture, etc.).  
This console-based Java application simulates a real inventory system by allowing staff to:

- Add and store inventory items
- Register staff members
- Assign and return equipment
- Search equipment using multiple criteria
- Generate reports using different loop types
- Handle invalid operations with custom exceptions

The system supports multiple item types using inheritance:
- **Equipment**
- **Furniture**
- **LabEquipment**

All items extend the abstract class **InventoryItem**, allowing them to be stored in a single array.

### Staff Assignments (Arrays)
- Each staff member can have **up to 5 assigned equipment items**
- Assignments are stored in an **Equipment[] array**
- The system checks equipment availability and staff assignment limits

### Search (Method Overloading)
The `InventoryManager` provides overloaded equipment searches:
- Search by **name**
- Search by **category** and optional availability filter
- Search by **warranty range**

### Reports (Loops)
`InventoryReports` generates reports using required loop types:
- Inventory report (**for loop**)
- Expired warranty report (**while loop**)
- Assignments by department (**foreach loop**)
- Utilisation rate (**nested loops**)
- Maintenance schedule (**do-while loop**)

### Exception Handling
Custom exceptions provide clear error handling:
- `InventoryException` (base)
- `EquipmentNotAvailableException`
- `StaffMemberNotFoundException`
- `AssignmentLimitExceededException`


