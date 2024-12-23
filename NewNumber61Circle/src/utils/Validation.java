/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Validation {

    public static String removeUnneccessaryBlank(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }

    public static String removeAllBlank(String input) {
        return input.trim().replaceAll("\\s+", "");
    }

    public static boolean pressYN() throws Exception {
        String input = getStringByRegex("Do you want to continue? (Y/N): ", "[YNyn]", "[YNyn]");
        return input.equalsIgnoreCase("y");
    }

    public static String normalFormName(String input) {
        input = removeUnneccessaryBlank(input);
        String[] temp = input.split(" ");
        input = "";
        for (int i = 0; i < temp.length; i++) {
            input = String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) {
                input += " ";
            }
        }
        return input;
    }

    public static String getNonEmptyString(String mess, String string) throws Exception {
        System.out.print(mess);
        string = removeUnneccessaryBlank(string);
        if (string.equalsIgnoreCase("")) {
            throw new Exception("Please input Non-Empty String!!!");
        }
        return string;
    }

    public static String normalFormStringAfterDot(String input) {
        String output = "";
        input = removeUnneccessaryBlank(input);
        input = String.valueOf(input.charAt(0)).toUpperCase() + input.substring(1);

        input = input.replaceAll("\\.\\s+", "\\.").replaceAll("\\s+\\.", "\\.");
        output += input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i - 1) == '.' && Character.isAlphabetic(input.charAt(i))) {
                output = " " + Character.toUpperCase(input.charAt(i));
            } else {
                output += input.charAt(i);
            }
        }
        return output;
    }

    public static int getInt(String string, String error, int min, int max) throws Exception {
        int input = Integer.parseInt(getStringByRegex(string, "[0-9]+", error));
        if (input < min || input > max) {
            throw new Exception("Out of range!");
        } else {
            return input;
        }
    }

    public static String getStringByRegex(String string, String regex, String err) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print(string);
        String input = removeUnneccessaryBlank(sc.nextLine());
        if (input.isEmpty()) {
            throw new Exception("Not null!");
        } else if (input.matches(regex)) {
            return input;
        } else {
            throw new Exception(err);
        }
    }

    public static String getEmail(String string) throws Exception {
        String regex = "^[A-Za-z](.*)([@]{1})(.{2,})(\\.)(.{2,})";//phai bat dau bang chu cai
        return getStringByRegex(string, regex, "Please enter email with format <account name>@<domain>");
    }

    public static String getPhone(String string) throws Exception {
        String regex = "[0-9 ]+";
String phoneNum = getStringByRegex(string, regex, "Please enter number only!!").replaceAll("\\s+", "");
        if (phoneNum.length() < 10 || phoneNum.length() > 11) {
            throw new Exception("Phone number must be at least 10 characters and at most 11 characters");
        } else {
            return phoneNum;
        }
    }

    public static double getDouble(String string, String error, double min, double max) throws Exception {
        double input = Double.parseDouble(getStringByRegex(string, "[0-9]*\\.?[0-9]+", error));
        if (input < min || input > max) {
            throw new Exception("Out of range!");
        } else {
            return input;
        }
    }
    public static float getFloat(String string, String error, float min, float max) throws Exception {
        float input = Float.parseFloat(getStringByRegex(string, "[0-9]*\\.?[0-9]+", error));
        if (input <= min || input > max) {
            throw new Exception("Out of range!");
        } else {
            return input;
        }
    }

    public static boolean getFormattedPassword(String password) throws Exception {
        password = removeUnneccessaryBlank(password);
        if (password.length() < 8 || password.length() > 32) {
            throw new Exception("Password must have length between 8 and 32 characters");
        }
        return true;
    }
}
