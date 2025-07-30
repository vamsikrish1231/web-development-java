class Compare{
    public static void main(String[] args){
        String psw = "vamsi@123";
        String psw2 = "vamsi#123";
        String psw3 = "vamsi@123";
        boolean result1 = psw.equals(psw2);
        System.out.println("Password is "+result1);
        boolean result2 = psw.equals(psw3);
        System.out.println("password is "+result2);
    }
}