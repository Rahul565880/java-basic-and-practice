class SupportTicket {
    String priorityLevel;
    String status;

    // No-argument constructor
    SupportTicket() {
        this.priorityLevel = "Medium";
        this.status = "Open";
    }
}

public class ParaConstructor {
    public static void main(String[] args) {
        SupportTicket ticket = new SupportTicket();
        System.out.println(ticket.priorityLevel); // Outputs: Medium
        System.out.println(ticket.status);        // Outputs: Open
    }
}

