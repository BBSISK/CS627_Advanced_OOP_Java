
public class Module {

    private String moduleName;
    private String moduleCode;
    private int credits;

    public Module(String moduleName, String moduleCode, int credits) {
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
        this.credits = credits;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        if (moduleName == null || moduleName.isBlank()) {
            System.out.println("Module name cannot be empty");
            return;
        }
        String checkModuleCode = moduleCode.toUpperCase();
        if (checkModuleCode.substring(0, 2).equals("CS")) {
            this.moduleCode = moduleCode.toUpperCase();
        } else {
            System.out.println("Invalid module code. It must start with 'CS'.");
        }
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        if (credits > 0 && credits <= 100) {
            this.credits = credits;
        } else {
            System.out.println("Invalid credits value. It must be between 1 and 100.");
        }
    }

    private boolean isCreditsPassed() {
       if (this.credits >= 40) {
            System.out.println("Credits passed");
            return true;
        } else {
            System.out.println("Credits failed");
            return false;
        }
    }   


    public void printModuleDetails() {
        System.out.println("Module Name: " + moduleName);
        System.out.println("Module Code: " + moduleCode);
        System.out.println("Module Credits: " + credits);
    }

}
