package OmniFood;

public @interface TestInfo {
    String TestCaseID() default "T000";
    String FunctionalArea() default "Unknown";
    String Description() default "Unknown";
}
