package com.github.livreprogramacao.monedero.business.role;

public enum CompanyRole {
    // Executive Level Roles
    CEO("Chief Executive Officer - Oversees the entire organization and makes high-level decisions."),
    COO("Chief Operating Officer - Manages day-to-day operations and implements company strategies."),
    CFO("Chief Financial Officer - Responsible for financial planning and risk management."),

    // Senior Management Roles
    VICE_PRESIDENT("Vice President - Provides leadership for specific departments."),
    GENERAL_MANAGER("General Manager - Oversees operations for a specific business unit or location."),

    // Middle Management Roles
    MANAGER("Manager - Directly supervises a team or department, responsible for execution."),
    ASSISTANT_MANAGER("Assistant Manager - Supports the manager and may take over their duties."),

    // Supervisory Level Roles
    TEAM_LEAD("Team Lead - Oversees a specific project or small team."),
    SUPERVISOR("Supervisor - Manages daily activities and performance of a group of employees."),

    // Staff Level Roles
    STAFF("Staff Employee - Executes tasks as assigned within their role."),
    INTERN("Intern - Gains experience and practical knowledge in a designated role.");

    private final String description;

    CompanyRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

