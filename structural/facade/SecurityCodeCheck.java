package structural.facade;

public class SecurityCodeCheck {
    private int securityCode = 123456;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isValidCode(int securityCode){
        if(securityCode == getSecurityCode()){
            return true;
        }
        return false;
    }
}
