package controller;

public interface RegexContainer {

   String REGEX_NAME_SURNAME = "[\\w'\\-,.][^0-9_!¡?÷?¿/\\\\+=@#$%ˆ&*(){}|~<>;:]{2,}";
    String REGEX_EMAIL = "^[A-Za-z0-9+_.-]+@(.+)$";
}
