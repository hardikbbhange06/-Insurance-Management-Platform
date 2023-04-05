package com.insurancemanagement.insurancemanagement.util;

public class ValidationUtil {

    // Validation methods
    public static boolean isValidName(String name) {
        return name.matches("[A-Za-z ]+");
    }

    public static boolean isValidDateOfBirth(String dateOfBirth) {
        return dateOfBirth.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    public static boolean isValidAddress(String address) {
        return address.matches("[A-Za-z0-9,. ]+");
    }

    public static boolean isValidContactInformation(String contactInformation) {
        return contactInformation.matches("[A-Za-z0-9@. ]+");
    }

    public static boolean isValidPolicyNumber(String policyNumber) {
        return policyNumber.matches("[A-Za-z0-9 ]+");
    }

    public static boolean isValidType(String type) {
        return type.matches("[A-Za-z ]+");
    }

    public static boolean isValidCoverageAmount(Integer coverageAmount) {
        return coverageAmount > 0;
    }

    public static boolean isValidPremium(Integer premium) {
        return premium > 0;
    }

    public static boolean isValidStartDate(String startDate) {
        return startDate.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    public static boolean isValidEndDate(String endDate) {
        return endDate.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    public static boolean isValidClaimNumber(String claimNumber) {
        return claimNumber.matches("[A-Za-z0-9 ]+");
    }

    public static boolean isValidDescription(String description) {
        return description.matches("[A-Za-z0-9,. ]+");
    }

    public static boolean isValidClaimDate(String claimDate) {
        return claimDate.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    public static boolean isValidClaimStatus(String claimStatus) {
        return claimStatus.matches("[A-Za-z ]+");
    }
 
    // Manipulation methods
    public static Integer calculatePremium(Integer coverageAmount) {
        return coverageAmount / 100;
    }

}
